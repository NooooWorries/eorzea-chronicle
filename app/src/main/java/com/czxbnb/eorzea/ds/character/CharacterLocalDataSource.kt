package com.czxbnb.eorzea.ds.character

import com.czxbnb.eorzea.database.CharacterDao
import com.czxbnb.eorzea.model.LodestoneCharacter
import com.czxbnb.eorzea.network.Result
import javax.inject.Inject

class CharacterLocalDataSource @Inject constructor(private val dao: CharacterDao) : CharacterDataSource {
    override suspend fun saveLodestoneCharacter(lodestoneCharacter: LodestoneCharacter?) {
        dao.deleteAll()
        dao.insertLodestoneCharacter(lodestoneCharacter)
    }

    override suspend fun getCharacterFromLocal(): LodestoneCharacter? {
        return dao.getLodestoneCharacter()
    }
}
