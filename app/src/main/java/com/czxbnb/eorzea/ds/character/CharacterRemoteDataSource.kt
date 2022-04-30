package com.czxbnb.eorzea.ds.character

import com.czxbnb.eorzea.api.CharacterApi
import com.czxbnb.eorzea.model.LodestoneCharacter
import com.czxbnb.eorzea.network.Result
import java.lang.Exception
import javax.inject.Inject

class CharacterRemoteDataSource @Inject constructor(private val api: CharacterApi) :
    CharacterDataSource {
    override suspend fun getCharacterFromRemote(lodestoneId: String?): Result<LodestoneCharacter>? {
        return try {
            val response = api.getLodestoneCharacter(lodestoneId)
            Result.Success(response)
        } catch (exception: Exception) {
            Result.Error(exception)
        }
    }
}
