package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnPrevious.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity2::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext, MainActivity2::class.java))
        }
    }
}