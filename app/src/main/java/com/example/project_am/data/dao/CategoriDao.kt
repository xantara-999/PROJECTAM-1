package com.example.project_am.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.project_am.data.entity.entityCategori

@Dao
interface CategoriDao {
    @Query("SELECT * FROM entityCategori")
    fun getAll(): List<entityCategori>

    @Query("SELECT * FROM entityCategori WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<entityCategori>

    @Insert
    fun insertAll(vararg users: entityCategori)

    @Delete
    fun delete(user: entityCategori)
}