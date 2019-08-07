package com.jzachlittle.keyverify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jzachlittle.keyverify.keyboard.KeyboardFragment

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		supportFragmentManager.beginTransaction()
			.replace(R.id.frame,
			KeyboardFragment.newInstance(),
			KeyboardFragment::class.java.name)
			.commit()
	}
}
