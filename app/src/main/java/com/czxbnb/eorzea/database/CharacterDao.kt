package com.czxbnb.eorzea.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.czxbnb.eorzea.model.LodestoneCharacter

@Dao
interface CharacterDao {
    @Insert
    suspend fun insertLodestoneCharacter(lodestoneCharacter: LodestoneCharacter?)

    @Query("SELECT * FROM lodestone_character LIMIT 1")
    suspend fun getLodestoneCharacter(): LodestoneCharacter?

    @Query("DELETE FROM lodestone_character")
    suspend fun deleteAll()
}
