package com.csc415.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity()
{
	private val LOG_TAG = MainActivity::class.java.simpleName

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		Log.d(LOG_TAG, "Hello World");
		Log.e(LOG_TAG, "Happy Birthday", IllegalArgumentException())
	}
}