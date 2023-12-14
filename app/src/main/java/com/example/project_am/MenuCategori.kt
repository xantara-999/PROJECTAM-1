package com.example.project_am

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView

class MenuCategori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_categori)

        val item1CardView = findViewById<CardView>(R.id.item1CardView)
        item1CardView.setOnClickListener {
            val intent = Intent (this, Variant::class.java)
            startActivity(intent)
        }
        val btnkeluar = findViewById<ImageButton>(R.id.btn1)
        btnkeluar.setOnClickListener {
            val intent = Intent(this, Dashboard_SA::class.java)
            startActivity(intent)
        }
    }
}