package com.jzachlittle.keyverify.keyboard

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.jzachlittle.keyverify.R

class KeyboardFragment: Fragment() {

    var keyboardViewModel: KeyboardViewModel? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        keyboardViewModel = ViewModelProviders.of(this) [KeyboardViewModel::class.java]
        return inflater.inflate(R.layout.fragment_keyboard, container, false)
    }

    companion object {
        fun newInstance(): KeyboardFragment {
            return KeyboardFragment()
        }
    }
}