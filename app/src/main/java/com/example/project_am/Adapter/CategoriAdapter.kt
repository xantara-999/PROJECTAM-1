package com.example.project_am.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.project_am.R
import com.example.project_am.data.entity.entityCategori

class CategoriAdapter(
    var list: List<entityCategori>
): RecyclerView.Adapter<CategoriAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var namaCategori: TextView
        init{
            namaCategori = view.findViewById(R.id.namakategorirow)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.rowcategori,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaCategori.text = list[position].namakategori
        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context,"Pindah halaman",Toast.LENGTH_SHORT).show()
        }
    }
}