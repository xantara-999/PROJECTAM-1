package com.example.project_am.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [kategori_barang::class],
    version = 1
)
abstract class Category_Database: RoomDatabase(){
    abstract  val dao: kategori_barang
}