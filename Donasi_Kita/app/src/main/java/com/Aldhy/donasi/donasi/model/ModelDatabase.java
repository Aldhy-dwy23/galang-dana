package com.Aldhy.donasi.donasi.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "tbl_donasi")
public class ModelDatabase implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "keterangan")
    public String keterangan;

    @ColumnInfo(name = "jml_uang")
    public int jmlUang;

    public ModelDatabase() {}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.uid);
        dest.writeString(this.keterangan);
        dest.writeInt(this.jmlUang);
    }

}
