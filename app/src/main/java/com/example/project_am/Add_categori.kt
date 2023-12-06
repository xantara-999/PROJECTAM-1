package com.example.project_am

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Add_categori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_categori)

        val btnkeluar = findViewById<ImageButton>(R.id.btn1)


        btnkeluar.setOnClickListener{
            val intent = Intent (this, Dashboard_SA::class.java)
            startActivity(intent)
        }
    }
}