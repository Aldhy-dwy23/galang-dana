package com.Aldhy.donasi.donasi.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.Aldhy.donasi.donasi.model.ModelDatabase;

import java.util.List;

@Dao
public interface DatabaseDao {

    @Query("SELECT * FROM tbl_donasi")
    LiveData<List<ModelDatabase>> getAllData();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertDonasi(ModelDatabase... modelDatabases);

    @Query("DELETE FROM tbl_donasi WHERE uid= :uid")
    void deleteSingleData(int uid);

    @Query("SELECT SUM(jml_uang) FROM tbl_donasi")
    LiveData<Integer> getTotalDonasi();
}
