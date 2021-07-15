package com.example.databaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import com.example.databaseexample.MyDbHandler;
import com.example.databaseexample.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHandler db = new MyDbHandler(MainActivity.this);

        // Creating a contact object for the db
        Contact Ravindra = new Contact();
        Ravindra.setPhoneNumber("9090909090");
        Ravindra.setName("Ravindra");

        // Adding a contact to the db
        db.addContact(Ravindra);

        Contact Mahendra = new Contact();
        Mahendra.setPhoneNumber("9090459090");
        Mahendra.setName("Mahendra");
        db.addContact(Mahendra);

        Contact Rajendra = new Contact();
        Rajendra.setPhoneNumber("9090675409");
        Rajendra.setName("Rajendra");
        db.addContact(Rajendra);
        Log.d("Ravi", "Id for tehri and larry are successfully added to the db");

        Rajendra.setId(46);
        Rajendra.setName("Rajendra Update");
        Rajendra.setPhoneNumber("0000000000");
        int affectedRows = db.updateContact(tehri);
        Log.d("Ravi", "Id for tehri and larry are successfully updated to the db");
        Log.d("Ravi", "No of affected rows are: " + affectedRows);

        // delete contact by id
        db.deleteContactById(1);
        db.deleteContactById(12);
        db.deleteContactById(5);

        // Get all contacts
        List<Contact> allContacts = db.getAllContacts();
        for(Contact contact: allContacts){
            Log.d("Ravi", "List Contact \nId: " + contact.getId() + "\n" +
                    "Name: " + contact.getName() + "\n"+
                    "Phone Number: " + contact.getPhoneNumber() + "\n" );
        }

        // count contact
        Log.d("Ravi", "You have total "+ db.getCount()+ " contacts in your database");

    }

}