package com.example.odin_2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG: String = "odin_2_3"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Вечером синим, вечером лунным")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Был я когда-то красивым и юным.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Неудержимо, неповторимо")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Все пролетело. далече.. мимо…")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Сердце остыло, и выцвели очи…")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Синее счастье! Лунные ночи!")
    }
}