package com.github.urmichm.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.urmichm.placesearchktx.Diana

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Diana.hello()
        setContentView(R.layout.activity_main)
        Diana.bye()
    }
}