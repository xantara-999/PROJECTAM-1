package com.example.project_am


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Dashboard_SA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_sa)

        val textViewUsername = findViewById<TextView>(R.id.username)

        val username = intent.getStringExtra("username")

        textViewUsername.text = "$username"


        val btn_profile = findViewById<ImageButton>(R.id.btn_profile)
        val btn_search = findViewById<Button>(R.id.btn_search)
        val btn_summary = findViewById<Button>(R.id.btn_summary)
        val btn_editp = findViewById<Button>(R.id.btn_editprdct)
        val btn_riwayat = findViewById<Button>(R.id.btn_riwayat)
        val btn_editcat = findViewById<Button>(R.id.btn_editcat)

        btn_profile.setOnClickListener{
            val intent = Intent (this, Profile::class.java)
            startActivity(intent)
        }
/*        btn_search.setOnClickListener{
            val intent = Intent (this, Search::class.java)
            startActivity(intent)
        }
        btn_summary.setOnClickListener{
            val intent = Intent (this, Summary::class.java)
            startActivity(intent)
        }
        btn_editp.setOnClickListener{
            val intent = Intent (this, Edit_Product_SA::class.java)
            startActivity(intent)
        }
        btn_riwayat.setOnClickListener{
            val intent = Intent (this, Riwayat::class.java)
            startActivity(intent)
        }
        btn_editcat.setOnClickListener{
            val intent = Intent (this, Edit_Category::class.java)
            startActivity(intent)
        }*/



    }
}