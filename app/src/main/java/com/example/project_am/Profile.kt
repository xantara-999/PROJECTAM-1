package com.example.project_am

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val btn_ubahpass = findViewById<Button>(R.id.btn_ubahpass)
        val btn_keluar = findViewById<Button>(R.id.btn_keluar)

/*        btn_ubahpass.setOnClickListener{
            val intent = Intent (this, UbahPass::class.java)
            startActivity(intent)
        }*/
        btn_keluar.setOnClickListener{
            val intent = Intent (this, Login::class.java)
            startActivity(intent)
        }



    }
}