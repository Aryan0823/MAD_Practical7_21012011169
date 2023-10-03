package com.example.mad_practical7_21012011169

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<FloatingActionButton>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, Youtube::class.java)
            startActivity(intent)
            finish()


        }
    }
}