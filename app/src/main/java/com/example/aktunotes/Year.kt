package com.example.aktunotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class Year : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_year)

        val intent = getIntent().getStringExtra("position")
        var year = 0

        findViewById<CardView>(R.id.yearI).setOnClickListener {

        }

    }
}