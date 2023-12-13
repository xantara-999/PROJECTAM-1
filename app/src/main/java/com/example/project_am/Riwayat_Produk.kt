package com.example.project_am


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Riwayat_Produk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_produk)

        val btnkeluar = findViewById<ImageButton>(R.id.btn2)


        btnkeluar.setOnClickListener {
            val intent = Intent(this, Dashboard_SA::class.java)
            startActivity(intent)
        }
    }
}