package com.czxbnb.eorzea.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.czxbnb.eorzea.R
import com.czxbnb.eorzea.component.CharacterCardFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CharacterCardFragment.newInstance())
                .commitNow()
        }
    }
}
