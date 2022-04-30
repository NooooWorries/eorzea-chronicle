package com.czxbnb.eorzea.database

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.czxbnb.eorzea.model.LodestoneCharacter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import javax.inject.Inject

@ProvidedTypeConverter
class CharacterTypeConverter @Inject constructor(private val gson: Gson) {
    @TypeConverter
    fun achievementsToString(achievements: LodestoneCharacter.Achievements?): String? =
        gson.toJson(achievements)

    @TypeConverter
    fun stringToAchievements(string: String?): LodestoneCharacter.Achievements? =
        gson.fromJson(string, LodestoneCharacter.Achievements::class.java)

    @TypeConverter
    fun characterToString(character: LodestoneCharacter.Character?): String? =
        gson.toJson(character)

    @TypeConverter
    fun stringToCharacter(string: String?): LodestoneCharacter.Character? =
        gson.fromJson(string, LodestoneCharacter.Character::class.java)

    @TypeConverter
    fun freeCompanyToString(freeCompany: LodestoneCharacter.FreeCompany): String? =
        gson.toJson(freeCompany)

    @TypeConverter
    fun stringToFreeCompany(string: String?): LodestoneCharacter.FreeCompany? =
        gson.fromJson(string, LodestoneCharacter.FreeCompany::class.java)

    @TypeConverter
    fun friendsToString(friends: List<LodestoneCharacter.Friend>?): String? = gson.toJson(friends)

    @TypeConverter
    fun stringToFriends(string: String?): List<LodestoneCharacter.Friend>? {
        val listType: Type = object : TypeToken<List<LodestoneCharacter.Friend>?>() {}.type
        return gson.fromJson(string, listType)
    }

    @TypeConverter
    fun minionsToString(minions: List<LodestoneCharacter.Minion>?): String? = gson.toJson(minions)

    @TypeConverter
    fun stringToMinions(string: String?): List<LodestoneCharacter.Minion>? {
        val listType: Type = object : TypeToken<List<LodestoneCharacter.Minion>?>() {}.type
        return gson.fromJson(string, listType)
    }

    @TypeConverter
    fun mountsToString(mounts: List<LodestoneCharacter.Mount>?): String? = gson.toJson(mounts)

    @TypeConverter
    fun stringToMounts(string: String?): List<LodestoneCharacter.Mount>? {
        val listType: Type = object : TypeToken<List<LodestoneCharacter.Mount>?>() {}.type
        return gson.fromJson(string, listType)
    }
}
