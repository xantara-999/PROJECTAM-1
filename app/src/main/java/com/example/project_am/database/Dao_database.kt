package com.example.project_am.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface Dao_database {
    @Upsert
    fun upsertCategory (kategoriBarang: kategori_barang)

    @Delete
    fun deleteCategory (kategoriBarang: kategori_barang)
    @Query("SELECT * FROM kategori_barang ORDER BY nama_kategori ASC ")
    fun getCategoryOrderByName(): LiveData<List<kategori_barang>>
}