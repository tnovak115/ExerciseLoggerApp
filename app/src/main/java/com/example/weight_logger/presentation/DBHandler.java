package com.example.weight_logger.presentation;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHandler extends SQLiteOpenHelper{
    private static final String DB_NAME = "exercisedb";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "exercises";
    private static final String EXERCISE_COL = "exercise";
    private static final String WEIGHT_COL = "weight";
    private static final String DATE_COL = "date";
    public DBHandler(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + DATE_COL + " TEXT,"
                + EXERCISE_COL + " TEXT,"
                + WEIGHT_COL + " TEXT)";
        db.execSQL(query);
    }
    public void addWorkout(String date, String exercise, int weight){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DATE_COL, date);
        values.put(EXERCISE_COL, exercise);
        values.put(WEIGHT_COL, weight);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

}
