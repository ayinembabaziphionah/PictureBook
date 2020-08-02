package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        btnPrevious.setOnClickListener {
            startActivity(Intent(baseContext,About::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext, About::class.java))
        }
    }
}