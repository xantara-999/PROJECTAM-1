package com.example.project_am

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class Variant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variant)

        val btnkeluar = findViewById<ImageButton>(R.id.btn1)
        val item1CardView = findViewById<CardView>(R.id.item1CardView)
        item1CardView.setOnClickListener {
            val intent = Intent (this, Summary::class.java)
            startActivity(intent)
        }
        btnkeluar.setOnClickListener {
            val intent = Intent(this, MenuCategori::class.java)
            startActivity(intent)
        }
    }
}