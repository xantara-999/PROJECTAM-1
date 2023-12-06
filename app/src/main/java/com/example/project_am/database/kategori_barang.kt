package com.example.project_am.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class kategori_barang(
    @PrimaryKey(autoGenerate = true)
    val id_kategori : Int = 0,
    val nama_kategori : String,
    val lokasi_gambar :String

)

