package com.czxbnb.eorzea.component

import com.czxbnb.eorzea.model.LodestoneCharacter
import com.czxbnb.eorzea.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class CharacterCardViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) {
//    private var character: Flow<LodestoneCharacter>? = null
//
//    fun getCharacter(lodestoneId: String): Flow<LodestoneCharacter> {
//        val result: Flow<LodestoneCharacter> = characterRepository.getCharacter(lodestoneId)
//    }
}