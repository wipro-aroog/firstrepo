package com.example.ar391064.myapplication;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.nfc.Tag;
import android.util.Log;
import android.widget.EditText;

import org.w3c.dom.Text;

/**
 * Created by AR391064 on 06/10/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static   final String DATABASE_NAME = "Wicruit.db";
private static final String TABLE_NAME = "User_Details";

    private static final String COL1 = "ID";
    private static final String COL2 = "EMAILID";
    private static final String COL3 = "PASSWORD";
    public String search;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);



    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,EMAILID TEXT,PASSWORD TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP IF TABLE EXISTS" + TABLE_NAME);
        onCreate(db);

    }
    public void insertData(String id, String emailId, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2,emailId);
        contentValues.put(COL3,password);
        db.insert(TABLE_NAME, null, contentValues);

    }
    public String searchEmailID(String emailIDEditBox){

        SQLiteDatabase db = this.getReadableDatabase();
        String query = "select EMAILID from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);


        if(cursor.moveToFirst()) {
            do {
                emailIDEditBox = cursor.getString(0);


                if (emailIDEditBox.equals(COL2)) {
                    emailIDEditBox = cursor.getString(0);

                    break;
                }
            }
            while (cursor.moveToNext());
        }

        return emailIDEditBox;
    }


    public boolean updateData( String id ,String emailId, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2,emailId);
        contentValues.put(COL3,password);
        db.update(TABLE_NAME, contentValues, "EMAILID = ?", new String[] {emailId});
        return true;

    }




}
