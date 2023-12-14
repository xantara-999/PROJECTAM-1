package com.example.project_am

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.project_am.data.Appdatabase
import com.example.project_am.data.entity.entityCategori

class Add_categori : AppCompatActivity() {
    private lateinit var nama_Categori: EditText
    private lateinit var btn_simpan: Button
    private lateinit var database: Appdatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_categori)

        val btnkeluar = findViewById<ImageButton>(R.id.btn1)

        nama_Categori = findViewById(R.id.namaCategori)
        btn_simpan = findViewById(R.id.btnsimpan)

        database = Appdatabase.getInstance(applicationContext)

        btn_simpan.setOnClickListener {
            if (nama_Categori.text.length > 0) {
                database.CategoriDao().insertAll(
                    entityCategori(
                        null,
                        nama_Categori.text.toString()
                    )
                )
                finish()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Silahkan Isi daa terlebih dahulu",
                    Toast.LENGTH_LONG
                ).show()
            }
        }


        btnkeluar.setOnClickListener{
            val intent = Intent (this, Variant::class.java)
            startActivity(intent)
        }
    }
}