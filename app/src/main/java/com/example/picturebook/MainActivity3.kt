package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btnPrevious.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity3::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity3::class.java))
        }
    }

}