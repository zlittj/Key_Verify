package com.jzachlittle.keyverify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.jzachlittle.keyverify.keyboard.KeyboardFragment

class MainActivity : AppCompatActivity() {

	private var mainViewModel: MainViewModel? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		 mainViewModel = ViewModelProviders.of(this) [MainViewModel::class.java]
		supportFragmentManager.beginTransaction()
			.replace(R.id.frame,
			KeyboardFragment.newInstance(),
			KeyboardFragment::class.java.name)
			.commit()
	}

	override fun onKeyUp(p0: Int, p1: KeyEvent?): Boolean {
		Toast.makeText(this, p0.toString(), Toast.LENGTH_SHORT).show()
		mainViewModel?.setKeyPress(p0)
		return true
	}

	override fun onKeyLongPress(p0: Int, p1: KeyEvent?): Boolean {
		Toast.makeText(this, p0.toString(), Toast.LENGTH_SHORT).show()
		mainViewModel?.setKeyPress(p0)
		return true
	}
}
