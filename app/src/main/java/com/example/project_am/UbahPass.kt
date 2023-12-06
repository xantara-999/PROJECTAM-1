package com.example.project_am

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class UbahPass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ubahpass)

        val btn_kembaliubhpass = findViewById<ImageButton>(R.id.btn_kembaliubhpass)

        btn_kembaliubhpass.setOnClickListener{
            val intent = Intent (this, Profile::class.java)
            startActivity(intent)
        }

    }
}