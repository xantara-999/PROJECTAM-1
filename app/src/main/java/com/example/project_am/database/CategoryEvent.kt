package com.example.project_am.database

sealed interface CategoryEvent{
    object saveCategory: CategoryEvent
    data class  Insert_Cat(val nama_kategori: String, val lokasi_gambar:String ):CategoryEvent
    data class DeleteCategory(val kategoriBarang: kategori_barang): CategoryEvent
}