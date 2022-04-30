package com.czxbnb.eorzea.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.czxbnb.eorzea.model.LodestoneCharacter
import com.google.gson.Gson

@Database(entities = [LodestoneCharacter::class], version = 1)
@TypeConverters(CharacterTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        private const val WEATHER_DATABASE_NAME = "weather_database"

        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()
        private val gson = Gson()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context, AppDatabase::class.java, WEATHER_DATABASE_NAME)
                .addTypeConverter(CharacterTypeConverter(gson))
                .fallbackToDestructiveMigration()
                .build()
    }

    abstract fun characterDao(): CharacterDao
}
