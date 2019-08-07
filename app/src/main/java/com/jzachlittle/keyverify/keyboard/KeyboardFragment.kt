package com.jzachlittle.keyverify.keyboard

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jzachlittle.keyverify.R

class KeyboardFragment: Fragment(), KeyEvent.Callback {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_keyboard, container, false)
    }

    override fun onKeyMultiple(p0: Int, p1: Int, p2: KeyEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onKeyDown(p0: Int, p1: KeyEvent?): Boolean {
       Toast.makeText(context, p0, Toast.LENGTH_SHORT).show()
        return true
    }

    override fun onKeyUp(p0: Int, p1: KeyEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onKeyLongPress(p0: Int, p1: KeyEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        fun newInstance(): KeyboardFragment {
            return KeyboardFragment()
        }
    }
}