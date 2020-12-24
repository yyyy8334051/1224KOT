package com.example.appkotlinlab11

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MySQLiteOpenHelper(context: Context):
    SQLiteOpenHelper(context, name, null, version) {
    companion object {
        private const val name = "mdatabase.db"
        private const val version = 1
    }
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE myTable(book text " +
                "PRIMARY KEY,price integer NOT NULL)")
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion:
    Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS myTable")
        onCreate(db)
    }
}