package com.example.project_am

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Profile_A : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_a)


        val btn_keluar = findViewById<Button>(R.id.btn_keluar)
        val btnkembali = findViewById<ImageButton>(R.id.btn_kembali)
        btnkembali.setOnClickListener{
            val intent = Intent (this, Dashboard_A::class.java)
            startActivity(intent)
        }


        btn_keluar.setOnClickListener{
            val intent = Intent (this, Login_Admin::class.java)
            startActivity(intent)
        }
    }
}