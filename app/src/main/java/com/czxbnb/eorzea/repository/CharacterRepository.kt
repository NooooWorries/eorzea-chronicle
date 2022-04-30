package com.czxbnb.eorzea.repository

import com.czxbnb.eorzea.ds.character.CharacterLocalDataSource
import com.czxbnb.eorzea.ds.character.CharacterRemoteDataSource
import com.czxbnb.eorzea.model.LodestoneCharacter
import javax.inject.Inject
import javax.inject.Singleton
import com.czxbnb.eorzea.network.Result

@Singleton
class CharacterRepository @Inject constructor(
    private val characterLocalDataSource: CharacterLocalDataSource,
    private val characterRemoteDataSource: CharacterRemoteDataSource
) {
    suspend fun getCharacter(lodestoneId: String?): LodestoneCharacter? {
        val localData = characterLocalDataSource.getCharacterFromLocal()
        if (localData == null) {
            return when (val remoteTask =
                characterRemoteDataSource.getCharacterFromRemote(lodestoneId)) {
                is Result.Success -> {
                    characterLocalDataSource.saveLodestoneCharacter(remoteTask.data)
                    remoteTask.data
                }
                is Result.Error -> {
                    throw remoteTask.exception
                }
                else -> {
                    null
                }
            }
        } else {
            return localData
        }
    }
}
