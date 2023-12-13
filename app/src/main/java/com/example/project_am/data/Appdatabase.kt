package com.example.project_am.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.project_am.data.dao.CategoriDao
import com.example.project_am.data.entity.entityCategori

@Database(entities = [entityCategori::class], version = 1)
abstract class Appdatabase : RoomDatabase() {
    abstract fun CategoriDao(): CategoriDao

    companion object{
        private var instance: Appdatabase? = null

        fun getInstance(context: Context): Appdatabase{
            if (instance==null){
                instance = Room.databaseBuilder(context,Appdatabase::class.java,"app-database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }
    }
}