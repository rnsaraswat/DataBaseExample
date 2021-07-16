package com.example.databaseexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class MyDbHandler extends SQLiteOpenHelper {

    public MyDbHandler(Context context) {
        super(context, Params.DB_NAME, null, Params.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        Log.d("Ravi", "on create ");
//        db.execSQL("DROP TABLE IF EXISTS " + Params.TABLE_NAME);
//        Log.d("Ravi", "on create drop table ");
//        SQLiteDatabase.deleteDatabase(new File(Params.DB_NAME));
        String create = "CREATE TABLE " + Params.TABLE_NAME + "("
                + Params.Question_KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Params.Question_Detail + " TEXT, "
                + Params.Question_Option1 + " TEXT, "
                + Params.Question_Option2 + " TEXT, "
                + Params.Question_Option3 + " TEXT, "
                + Params.Question_Option4 + " TEXT, "
                + Params.Question_Answer + " INTEGER "
                + ")";
        Log.d("Ravi", "Query being run is : " + create);
        db.execSQL(create);
        Log.d("Ravi", "Create table  : ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // add question
    public void addContact(Question question) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues questionValues = new ContentValues();
//        questionValues.put(Params.Question_KEY_ID, question.getId());
        questionValues.put(Params.Question_Detail, question.getQuestion_Detail());
        questionValues.put(Params.Question_Option1, question.getQuestion_Option1());
        questionValues.put(Params.Question_Option2, question.getQuestion_Option2());
        questionValues.put(Params.Question_Option3, question.getQuestion_Option3());
        questionValues.put(Params.Question_Option4, question.getQuestion_Option4());
        questionValues.put(Params.Question_Answer, question.getQuestion_Answer());


        db.insert(Params.TABLE_NAME, null, questionValues);
        Log.d("Ravi", "addContact : Successfully inserted " + questionValues);
        db.close();
        Log.d("Ravi", "addContact : Successfully close ");

    }

    // list questions
    public List<Question> getAllContacts() {
        List<Question> questionList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        // Generate the query to read from the database
        String select = "SELECT * FROM " + Params.TABLE_NAME;
        Cursor cursor = db.rawQuery(select, null);

        //Loop through now
        if (cursor.moveToFirst()) {
            Log.d("Ravi", "List<Question> : Successfully Listed ");
            do {
                Question question = new Question();
                question.setId(Integer.parseInt(cursor.getString(0)));
                question.setQuestion_Detail(cursor.getString(1));
                question.setQuestion_Option1(cursor.getString(2));
                question.setQuestion_Option2(cursor.getString(3));
                question.setQuestion_Option3(cursor.getString(4));
                question.setQuestion_Option4(cursor.getString(5));
                question.setQuestion_Answer(cursor.getString(6));
                questionList.add(question);
                Log.d("Ravi", "List<Question> : Successfully Listed " + question);
            } while (cursor.moveToNext());
        }
        return questionList;
    }

    // Update Quextion
    public int updateContact(Question question) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues questionValues = new ContentValues();
        questionValues.put(Params.Question_KEY_ID, question.getId());
        questionValues.put(Params.Question_Detail, question.getQuestion_Detail());
        questionValues.put(Params.Question_Option1 , question.getQuestion_Option1());
        questionValues.put(Params.Question_Option2, question.getQuestion_Option2());
        questionValues.put(Params.Question_Option3, question.getQuestion_Option3());
        questionValues.put(Params.Question_Option4, question.getQuestion_Option4());
        questionValues.put(Params.Question_Answer, question.getQuestion_Answer());

        //Lets update now
        Log.d("Ravi", "updateContact : Successfully updated " + questionValues);

        return db.update(Params.TABLE_NAME, questionValues, Params.Question_KEY_ID + "=?",
                new String[]{String.valueOf(question.getId())});

    }

    // delete question by id
    public void deleteContactById(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Params.TABLE_NAME, Params.Question_KEY_ID + "=?", new String[]{String.valueOf(id)});
        db.close();
    }

    // delete question by id
    public void deleteContact(Question question) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Params.TABLE_NAME, Params.Question_KEY_ID + "=?", new String[]{String.valueOf(question.getId())});
        db.close();
    }

    public int getCount() {
        String query = "SELECT  * FROM " + Params.TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        return cursor.getCount();


    }
}
