package com.erluxman.zodiacbgexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.zodiacbg.RashiBGView

private class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val v: RashiBGView = findViewById(R.id.background) as RashiBGView
    }
}
