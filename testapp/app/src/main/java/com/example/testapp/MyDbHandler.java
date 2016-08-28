package com.example.testapp;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;
import android.util.Log;


public class MyDbHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "data.db";
    private static final String TABLE_FDATA = "FData";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_BloodP = "BloodP";
    private static final String COLUMN_BloodS = "BloodS";
    private static final String COLUMN_Walking = "Walking";
    private static final String COLUMN_Running = "Running";
    private static final String COLUMN_Cycling = "Cycling";
    private static final String COLUMN_Weight = "Weight";
    private static final String COLUMN_DateTime = "DateT";

    private final String TAG = "TXT";


    public MyDbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + TABLE_FDATA + " ( " +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                COLUMN_BloodP + " TEXT ," + COLUMN_BloodS + " TEXT ," + COLUMN_Walking
                + " TEXT ," + COLUMN_Running + " TEXT ," + COLUMN_Cycling + " TEXT ," +
                COLUMN_Weight + " TEXT ," + COLUMN_DateTime + " TEXT " +
                ");";
        Log.d(TAG,query);
        sqLiteDatabase.execSQL(query);


    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_FDATA);
        onCreate(sqLiteDatabase);
    }

    public void addData(Data entry) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_BloodP,entry.get_data_bloodP());
        values.put(COLUMN_BloodS,entry.get_data_bloodS());
        values.put(COLUMN_Walking,entry.get_data_walking());
        values.put(COLUMN_Running,entry.get_data_running());
        values.put(COLUMN_Cycling,entry.get_data_cycling());
        values.put(COLUMN_Weight,entry.get_data_weight());
        values.put(COLUMN_DateTime,entry.get_data_dateT());
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.insert(TABLE_FDATA,null,values);
        sqLiteDatabase.close();
    }

    /**
    public void delProduct(String productName) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("DELETE FROM " + TABLE_FDATA + " WHERE " + COLUMN_BloodP + " = \"" + productName + "\";" );
        sqLiteDatabase.close();
    }

     **/
    public String dbToString() {
        String dbString = "";
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_FDATA;


        Cursor c = sqLiteDatabase.rawQuery(query,null);
        c.moveToFirst();
        dbString += "BP Suger Walk(KM) Run(KM) Cycle(KM) Weight(KG)";
        dbString += "\n";

        while(!c.isAfterLast()) {
            if(c.getString(c.getColumnIndex("id"))!= null) {
                dbString += c.getString(c.getColumnIndex("BloodP"));
                dbString += " ";
                dbString += c.getString(c.getColumnIndex("BloodS"));
                dbString += " ";
                dbString += c.getString(c.getColumnIndex("Walking"));
                dbString += " ";
                dbString += c.getString(c.getColumnIndex("Running"));
                dbString += " ";
                dbString += c.getString(c.getColumnIndex("Cycling"));
                dbString += " ";
                dbString += c.getString(c.getColumnIndex("Weight"));
                dbString += "\n";

                Log.d(TAG, "dbString value : " + dbString);
                c.moveToNext();
            }
        }
        sqLiteDatabase.close();
        return dbString;


    }
}