package com.czxbnb.eorzea.ds.character

import com.czxbnb.eorzea.model.LodestoneCharacter
import com.czxbnb.eorzea.network.Result

interface CharacterDataSource {
    suspend fun getCharacterFromRemote(lodestoneId: String?): Result<LodestoneCharacter>? = null

    suspend fun saveLodestoneCharacter(lodestoneCharacter: LodestoneCharacter?) {}

    suspend fun getCharacterFromLocal(): LodestoneCharacter? = null
}
