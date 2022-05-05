package com.czxbnb.eorzea.component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import com.czxbnb.eorzea.R

class CharacterCardFragment : Fragment() {
    companion object {
        @JvmStatic
        fun newInstance() = CharacterCardFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Text("Hello world!")
            }
        }
    }
}