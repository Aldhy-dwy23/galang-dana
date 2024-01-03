package com.Aldhy.donasi.donasi.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.Aldhy.donasi.donasi.database.dao.DatabaseDao;
import com.Aldhy.donasi.donasi.model.ModelDatabase;


@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
