package com.sid.marvel;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

class Dbhelper extends SQLiteOpenHelper {


    public Dbhelper(@Nullable Context context) {
        super(context, "Marvel", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String query ="CREATE TABLE MARVELTABLE (movie TEXT, details TEXT)";

        try{
            sqLiteDatabase.execSQL(query);
        }
        catch (Exception e){

        }


    }
    public void insert(String name, String details){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("movie",name);
        values.put("details",details);
        sqLiteDatabase.insert("MARVELTABLE",null,values);
    }
    public String query(String name){
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();


        String selectQuery = "SELECT  * FROM MARVELTABLE  WHERE movie = '" + name+"'";
        Cursor c=sqLiteDatabase.rawQuery(selectQuery,null);
        c.moveToFirst();
        String det=c.getString(1);
        return det;



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {



    }
}

