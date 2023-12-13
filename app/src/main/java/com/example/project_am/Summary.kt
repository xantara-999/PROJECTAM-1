package com.example.project_am

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_am.Adapter.CategoriAdapter
import com.example.project_am.data.Appdatabase
import com.example.project_am.data.entity.entityCategori
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Summary : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var fab: FloatingActionButton
    private var list = mutableListOf<entityCategori>()
    private lateinit var adapter: CategoriAdapter
    private lateinit var database: Appdatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.summary)

        val btnkeluar = findViewById<ImageButton>(R.id.btn1)
        recyclerView = findViewById(R.id.rv)
        fab = findViewById(R.id.fab)

        database = Appdatabase.getInstance(applicationContext)
        adapter = CategoriAdapter(list)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        recyclerView.addItemDecoration(DividerItemDecoration(applicationContext, RecyclerView.VERTICAL))

        fab.setOnClickListener{
            startActivity(Intent(this,Add_categori::class.java))
        }
        btnkeluar.setOnClickListener {
            val intent = Intent(this, Dashboard_SA::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        getData()
    }


    @SuppressLint("notifyDataSetChanged")
    fun getData(){
        list.clear()
        list.addAll(database.CategoriDao().getAll())
        adapter.notifyDataSetChanged()
    }
}