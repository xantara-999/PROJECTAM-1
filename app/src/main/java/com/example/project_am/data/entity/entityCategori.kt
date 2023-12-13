package com.example.project_am.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
class entityCategori (
        @PrimaryKey(autoGenerate = true) var uid: Int? = null,
        @ColumnInfo(name = "nama_kategori") var namakategori: String? = null
)