package com.example.project_am

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.project_am.Adapter.ProductAdapter
import com.example.project_am.data.Appdatabase
import com.example.project_am.data.entity.Product

class Tampil_Produk : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var list  = mutableListOf<Product>()
    private lateinit var adapter: ProductAdapter
    private lateinit var database: Appdatabase
    private lateinit var btnKeluar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil_produk)
        btnKeluar = findViewById(R.id.btn1)
        recyclerView = findViewById(R.id.recyclerProduk)

        database= Appdatabase.getInstance((applicationContext))
        adapter= ProductAdapter(list)
        adapter.setDialog(object : ProductAdapter.Dialog{
            override fun onClick(position: Int) {
               val dialog = AlertDialog.Builder(this@Tampil_Produk)
                dialog.setTitle(list[position].productName)
                dialog.setItems(R.array.items_option, DialogInterface.OnClickListener{ dialog, which->
                    if(which==0){
                        //code ubah
                        val intent = Intent(this@Tampil_Produk, Add_Produk::class.java)
                        intent.putExtra("id", list[position].uid)
                        startActivity(intent)
                    }else if (which==1){
                        //code hapus
                        database.productDao().delete(list[position])
                        getData()
                    }else{
                        dialog.dismiss()
                    }

                })
                val dialogView = dialog.create()
                dialogView.show()
            }

        })

        recyclerView.adapter = adapter

        recyclerView.layoutManager = LinearLayoutManager(applicationContext, VERTICAL, false)
        recyclerView.addItemDecoration(DividerItemDecoration(applicationContext, VERTICAL))

        btnKeluar.setOnClickListener{
            startActivity(Intent(this, Dashboard_SA::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        getData()
    }
    @SuppressLint("NotifyDataSetChanged")
    fun getData(){
        list.clear()
        list.addAll(database.productDao().getAllProducts())
        adapter.notifyDataSetChanged()
    }
    }
