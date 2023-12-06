package com.example.project_am.database

data class Category_state(
    val kategoriBarang: List<kategori_barang> = emptyList(),
    val nama_kategori: String = "",
    val lokasi_gambar: String = "",
)
