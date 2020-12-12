package com.miniproject.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    val splashTime = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed(
            {
                val intent = Intent(this@MainActivity, Home::class.java)
                startActivity(intent)
                finish()
        },splashTime)
    }
}
