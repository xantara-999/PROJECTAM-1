package com.example.project_am

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener{
            val intent = Intent (this, Dashboard_SA::class.java)
            startActivity(intent)
        }


    }
}