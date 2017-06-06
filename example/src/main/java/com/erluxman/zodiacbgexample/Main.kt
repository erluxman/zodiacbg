package com.erluxman.zodiacbgexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.erluxman.zodiacbg.ZodiacBGView

private class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bg :ZodiacBGView= findViewById(R.id.background)  as ZodiacBGView
        bg.setZodiacNumber(3)
    }
}
