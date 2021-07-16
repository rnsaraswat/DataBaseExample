package com.example.databaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDbHandler db = new MyDbHandler(MainActivity.this);
        // Creating a contact object for the db
        Question q1 = new Question();
        q1.setQuestion_Detail("Presentation of the first ever railway budget in India held in");
        q1.setQuestion_Option1("1853");
        q1.setQuestion_Option2("1888");
        q1.setQuestion_Option3("1925");
        q1.setQuestion_Option4("1905");
        q1.setQuestion_Answer("3");

        // Adding a contact to the db
        db.addContact(q1);
        Log.d("Ravi", "Id for " + q1.getId() + " successfully added to the db " + q1);
        Log.d("Ravi", "Start 10");

        Question q2 = new Question();
        q2.setQuestion_Detail("Which is the shortest station name in Indian Railways? ");
        q2.setQuestion_Option1("Pune");
        q2.setQuestion_Option2("Bc");
        q2.setQuestion_Option3("Goa");
        q2.setQuestion_Option4("Ib");
        q2.setQuestion_Answer("4");
        db.addContact(q2);
        Log.d("Ravi", "Id for " + q2.getId() + " successfully added to the db " + q2);
        Question q3 = new Question();
        q3.setQuestion_Detail("Which is the longest station name in Indian Railways? ");
        q3.setQuestion_Option1("Kanyakumari");
        q3.setQuestion_Option2("Venkatanarasimharajuvariapeta");
        q3.setQuestion_Option3("Kharagpur");
        q3.setQuestion_Option4("Chhatrapati Shivaji Terminus");
        q3.setQuestion_Answer("2");
        db.addContact(q3);
        Log.d("Ravi", "Id for " + q3.getId() + " successfully added to the db " + q3);
        Question q4 = new Question();
        q4.setQuestion_Detail("Where is the wheel and axle plant of Indian Railways situated? ");
        q4.setQuestion_Option1( "Chittranjan");
        q4.setQuestion_Option2("Kapurthala");
        q4.setQuestion_Option3("Bangalore");
        q4.setQuestion_Option4("Perambur");
        q4.setQuestion_Answer("3");
        db.addContact(q4);
        Log.d("Ravi", "Id for " + q4.getId() + " successfully added to the db " + q4);
        Question q5 = new Question();
        q5.setQuestion_Detail("At which of the following places Diesel Component Works is established?");
        q5.setQuestion_Option1("Jamshedpur");
        q5.setQuestion_Option2("Patiala");
        q5.setQuestion_Option3("Perambur");
        q5.setQuestion_Option4("Varanasi");
        q5.setQuestion_Answer("Varanasi");
        db.addContact(q5);
        Log.d("Ravi", "Id for " + q5.getId() + " successfully added to the db " + q5);
        Question q6 = new Question();
        q6.setQuestion_Detail("Diesel Locomotive Works is situated at");
        q6.setQuestion_Option1("Perambur");
        q6.setQuestion_Option2("Varanasi");
        q6.setQuestion_Option3("Kapurthala");
        q6.setQuestion_Option4("Bangalore");
        q6.setQuestion_Answer("2");
        db.addContact(q6);
        Log.d("Ravi", "Id for " + q6.getId() + " successfully added to the db " + q6);
        Question q7 = new Question();
        q7.setQuestion_Detail("The passenger bogies of the Indian Railways are manufactured at which of the following places? ");
        q7.setQuestion_Option1("Kapurthala");
        q7.setQuestion_Option2("Chittranjan");
        q7.setQuestion_Option3("Perambur");
        q7.setQuestion_Option4("Bangalore");
        q7.setQuestion_Answer("3");
        db.addContact(q7);
        Log.d("Ravi", "Id for " + q7.getId() + " successfully added to the db " + q7);
        Question q8 = new Question();
        q8.setQuestion_Detail("In diesel engine, ignition is caused by");
        q8.setQuestion_Option1("Spark");
        q8.setQuestion_Option2("Automatic starter");
        q8.setQuestion_Option3("Compression ");
        q8.setQuestion_Option4("Friction");
        q8.setQuestion_Answer("3");
        db.addContact(q8);
        Log.d("Ravi", "Id for " + q8.getId() + " successfully added to the db " + q8);
        Question q9 = new Question();
        q9.setQuestion_Detail("Which train in India has the longest route length? ");
        q9.setQuestion_Option1("Vivek Express");
        q9.setQuestion_Option2("Indrani Express");
        q9.setQuestion_Option3("Kanyakumari Express");
        q9.setQuestion_Option4("Bangalore Guwahati Express");
        q9.setQuestion_Answer("1");
        db.addContact(q9);
        Log.d("Ravi", "Id for " + q9.getId() + " successfully added to the db" + q9);
        Question q10 = new Question();
        q10.setQuestion_Detail("When was the first underground railway (Metro Railway) started? ");
        q10.setQuestion_Option1("1982");
        q10.setQuestion_Option2("1989");
        q10.setQuestion_Option3("1984");
        q10.setQuestion_Option4("1992");
        q10.setQuestion_Answer("3");
        db.addContact(q10);
        Log.d("Ravi", "Id for " + q10.getId() + " successfully added to the db " + q10);
        Question q11 = new Question();
        q11.setQuestion_Detail("A station where the rail lines end, is called");
        q11.setQuestion_Option1("Junction station");
        q11.setQuestion_Option2("Way-side station");
        q11.setQuestion_Option3("Block station");
        q11.setQuestion_Option4("Terminal station");
        q11.setQuestion_Answer("4");
        db.addContact(q11);
        Log.d("Ravi", "Id for " + q11.getId() + " successfully added to the db " + q11);
        Question q12 = new Question();
        q12.setQuestion_Detail("How much distance was travelled by first train of India? ");
        q12.setQuestion_Option1("33 km");
        q12.setQuestion_Option2("36 km");
        q12.setQuestion_Option3("34 km");
        q12.setQuestion_Option4("46 km");
        q12.setQuestion_Answer("3");
        db.addContact(q12);
        Log.d("Ravi", "Id for " + q12.getId() + " successfully added to the db " + q12);
        Question q13 = new Question();
        q13.setQuestion_Detail("What is the position of the Indian Railway in the world according to the length of rail lines? ");
        q13.setQuestion_Option1("First");
        q13.setQuestion_Option2("Second");
        q13.setQuestion_Option3("Third");
        q13.setQuestion_Option4("Fourth");
        q13.setQuestion_Answer("4");
        db.addContact(q13);
        Log.d("Ravi", "Id for " + q13.getId() + " successfully added to the db " + q13);
        Question q14 = new Question();
        q14.setQuestion_Detail("General Manger is responsible for");
        q14.setQuestion_Option1("Railway Board");
        q14.setQuestion_Option2("Railway Ministry");
        q14.setQuestion_Option3("Both railway Board and Railway Ministry");
        q14.setQuestion_Option4("None of these");
        q14.setQuestion_Answer("1");
        db.addContact(q14);
        Log.d("Ravi", "Id for " + q14.getId() + " successfully added to the db " + q14);
        Question q15 = new Question();
        q15.setQuestion_Detail("The headquarters of South-Central Railways is situated at");
        q15.setQuestion_Option1("Mumbai (CST) ");
        q15.setQuestion_Option2("Chennai");
        q15.setQuestion_Option3("Secundrabad");
        q15.setQuestion_Option4( "mumbai (Charch Gate)");
        q15.setQuestion_Answer("3");
        db.addContact(q15);
        Log.d("Ravi", "Id for " + q15.getId() + " successfully added to the db" + q15);

        // update question
        q15.setQuestion_Detail("The headquarters of South-Central Railways is situated at");
        q15.setQuestion_Option1("1 Mumbai (CST) ");
        q15.setQuestion_Option2("2 Chennai");
        q15.setQuestion_Option3("3 Secundrabad");
        q15.setQuestion_Option4( "4 mumbai (Charch Gate)");
        q15.setQuestion_Answer("3");
        int affectedRows = db.updateContact(q15);
        Log.d("Ravi", "Id for " + q15 + " successfully updated to the db" + q15);
        Log.d("Ravi", "No of affected rows are: " + affectedRows);

        q15.setQuestion_Detail("The headquarters of South-Central Railways is situated at");
        q15.setQuestion_Option1("5 Mumbai (CST) ");
        q15.setQuestion_Option2("6 Chennai");
        q15.setQuestion_Option3("7 Secundrabad");
        q15.setQuestion_Option4( "8 mumbai (Charch Gate)");
        q15.setQuestion_Answer("3");
        affectedRows = db.updateContact(q15);
        Log.d("Ravi", "Id for " + q15 + " successfully updated to the db" + q15);
        Log.d("Ravi", "No of affected rows are: " + affectedRows);

        q15.setQuestion_Detail("The headquarters of South-Central Railways is situated at");
        q15.setQuestion_Option1("Mumbai (CST) ");
        q15.setQuestion_Option2("Chennai");
        q15.setQuestion_Option3("Secundrabad");
        q15.setQuestion_Option4( "mumbai (Charch Gate)");
        q15.setQuestion_Answer("3");
        affectedRows = db.updateContact(q15);
        Log.d("Ravi", "Id for " + q15 + " successfully updated to the db" + q15);
        Log.d("Ravi", "No of affected rows are: " + affectedRows);

        // delete contact by id
//        db.deleteContactById(2);
//        db.deleteContactById(3);
//        db.deleteContactById(4);
//        db.deleteContactById(6);
//        db.deleteContactById(7);
//        db.deleteContactById(8);
//        db.deleteContactById(9);
//        db.deleteContactById(10);
//        Log.d("Ravi", "Id for 17 successfully updated to the db");
//        db.deleteContactById(18);
//        Log.d("Ravi", "Id for 18 successfully updated to the db");
//        db.deleteContactById(19);
//        Log.d("Ravi", "Id for 19 successfully updated to the db");

        // Get all question
        List<Question> allQuestions = db.getAllContacts();
        for(Question question : allQuestions){
            Log.d("Ravi", "List Question \nId: " + question.getId() + "\n" +
                    "Question : " + question.getQuestion_Detail() + "\n" +
                    "Option 1: " + question.getQuestion_Option1() + "\n" +
                    "Option 2: " + question.getQuestion_Option2() + "\n" +
                    "Option 3: " + question.getQuestion_Option3() + "\n" +
                    "Option 4: " + question.getQuestion_Option4() + "\n" +
                    "Answer : " + question.getQuestion_Answer() + "\n" );
        }

        // count question
        Log.d("Ravi", "You have total "+ db.getCount()+ " Question in your database");

    }

}