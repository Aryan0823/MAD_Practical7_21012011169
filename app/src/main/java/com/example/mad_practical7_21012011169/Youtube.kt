package com.example.mad_practical7_21012011169

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Youtube : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val button = findViewById<FloatingActionButton>(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this@Youtube, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}