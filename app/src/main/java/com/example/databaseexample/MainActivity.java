package com.example.databaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.databaseexample.Params.Question_KEY_ID;

/*
APP - DataBaseExample
Path D:\AndroidStudioProjects\RNS\DataBaseExample
Github Repository - DataBaseExample

This is SQL database example
This is Multiple choice Question type data base
This is Display Question list in logcat
Data is added/updated/deleted/listed in logcat only

Updated to add/Edit/Delete/record in main activity screen

 */
public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    EditText editquestionid;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    ListView listView;
    private Question currentQuestion;
    private int questionCounter;
    int id_To_Update = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.editTextViewQ);
        textView3 = findViewById(R.id.editTextViewOA);
        textView4 = findViewById(R.id.editTextViewOB);
        textView5 = findViewById(R.id.editTextViewOC);
        textView6 = findViewById(R.id.editTextViewOD);
        textView7 = findViewById(R.id.editTextViewAns);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        EditText editText = (EditText) findViewById(R.id.editquestionid);

        MyDbHandler db = new MyDbHandler(MainActivity.this);
        ArrayList questionList = db.getAllCotacts();
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, questionList);
        Log.d("Ravi", "Start 2");

        // display question in list view on Question
        List<Question> getAllCotacts = db.getAllContacts();
        Log.d("Ravi", " List View ");
        currentQuestion = (Question) questionList.get(questionCounter);

        listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
        textView.setText(Question_KEY_ID);
        Log.d("Ravi", " List View " + Question_KEY_ID);
        textView2.setText(currentQuestion.getQuestion_Detail());
        textView3.setText(currentQuestion.getQuestion_Option1());
        textView4.setText(currentQuestion.getQuestion_Option2());
        textView5.setText(currentQuestion.getQuestion_Option3());
        textView6.setText(currentQuestion.getQuestion_Option4());
        textView7.setText(currentQuestion.getQuestion_Answer());

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "List Button Clicked", Toast.LENGTH_SHORT).show();
                Log.d("Ravi", " MainActivity setOnClickListener onClick 1 ");
//                Log.d("Ravi", " MainActivity setOnClickListener onClick 2 ");

                int questionid = Integer.parseInt(editText.getText().toString());
                currentQuestion = (Question) questionList.get(questionid);
                Log.d("Ravi", " MainActivity setOnClickListener onClick 4 " + questionid);
                textView.setText(Question_KEY_ID);
                Log.d("Ravi", " List View " + Question_KEY_ID);
                textView2.setText(currentQuestion.getQuestion_Detail());
                textView3.setText(currentQuestion.getQuestion_Option1());
                textView4.setText(currentQuestion.getQuestion_Option2());
                textView5.setText(currentQuestion.getQuestion_Option3());
                textView6.setText(currentQuestion.getQuestion_Option4());
                textView7.setText(currentQuestion.getQuestion_Answer());
                Log.d("Ravi", " MainActivity setOnClickListener onClick 5 " + questionid);

                //        Setting Text Using Java class:
                //        Below is the example code in which we set the text on Button programmatically means in java class.
                //        The output will be same as the above.
                Button button5 = (Button) findViewById(R.id.button5);
                button5.setText("Previous");//set the text on button
                Button button6 = (Button) findViewById(R.id.button6);
                button6.setText("Next");//set the text on button
            }
        });

//        Setting Text Color On Button Inside Java class:
//        Below is the example code in which we set the text color of a Button programmatically means in java class.
//
//        Button simpleButton=(Button) findViewById(R.id.simpleButton);
//        simpleButton.setTextColor(Color.RED);//set the red color for the text

//        Setting textSize In Java class:
//        Below is the example code in which we set the text size of a Button programmatically means in java class.
//        Button simpleButton=(Button)findViewById(R.id.simpleButton);
//        simpleButton.setTextSize(25);//set the text size of button

//        Setting background in Button In Java class:
//        Below is the example code in which we set the background color of a Button programmatically means in java class.
//
//        Button simpleButton=(Button)findViewById(R.id.simpleButton);
//        simpleButton.setBackgroundColor(Color.BLACK);//set the black color of button background


        // add
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Add Button Clicked", Toast.LENGTH_SHORT).show();
                Log.d("Ravi", " MainActivity setOnClickListener onClick 1 ");
//                Log.d("Ravi", " MainActivity setOnClickListener onClick 2 ");

                int questionid = Integer.parseInt(editText.getText().toString());
                currentQuestion = (Question) questionList.get(questionid);
                Log.d("Ravi", " MainActivity setOnClickListener onClick 4 " + questionid);
                textView.setText(Question_KEY_ID);
                Log.d("Ravi", " List View " + Question_KEY_ID);
                textView2.setText(currentQuestion.getQuestion_Detail());
                textView3.setText(currentQuestion.getQuestion_Option1());
                textView4.setText(currentQuestion.getQuestion_Option2());
                textView5.setText(currentQuestion.getQuestion_Option3());
                textView6.setText(currentQuestion.getQuestion_Option4());
                textView7.setText(currentQuestion.getQuestion_Answer());
                Log.d("Ravi", " MainActivity setOnClickListener onClick 5 " + questionid);

                //        Setting Text Using Java class:
                //        Below is the example code in which we set the text on Button programmatically means in java class.
                //        The output will be same as the above.
                Button button5 = (Button) findViewById(R.id.button5);
                button5.setText("Dsicard");//set the text on button
                Button button6 = (Button) findViewById(R.id.button6);
                button6.setText("Save");//set the text on button
            }
        });

        // Update
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Update Button Clicked", Toast.LENGTH_SHORT).show();
                Log.d("Ravi", " MainActivity setOnClickListener onClick 1 ");

                int questionid = Integer.parseInt(editText.getText().toString());
                currentQuestion = (Question) questionList.get(questionid);
                Log.d("Ravi", " MainActivity setOnClickListener onClick 4 " + questionid);
                textView.setText(Question_KEY_ID);
                Log.d("Ravi", " List View " + Question_KEY_ID);
                textView2.setText(currentQuestion.getQuestion_Detail());
                textView3.setText(currentQuestion.getQuestion_Option1());
                textView4.setText(currentQuestion.getQuestion_Option2());
                textView5.setText(currentQuestion.getQuestion_Option3());
                textView6.setText(currentQuestion.getQuestion_Option4());
                textView7.setText(currentQuestion.getQuestion_Answer());
                Log.d("Ravi", " MainActivity setOnClickListener onClick 5 " + questionid);

                Button button5 = (Button) findViewById(R.id.button5);
                button5.setText("Dsicard");//set the text on button
                Button button6 = (Button) findViewById(R.id.button6);
                button6.setText("Save");//set the text on button
            }
        });

        // Delete
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Delete Button Clicked", Toast.LENGTH_SHORT).show();
                Log.d("Ravi", " MainActivity setOnClickListener onClick 1 ");

                int questionid = Integer.parseInt(editText.getText().toString());
                currentQuestion = (Question) questionList.get(questionid);
                Log.d("Ravi", " MainActivity setOnClickListener onClick 4 " + questionid);
                textView.setText(Question_KEY_ID);
                Log.d("Ravi", " List View " + Question_KEY_ID);
                textView2.setText(currentQuestion.getQuestion_Detail());
                textView3.setText(currentQuestion.getQuestion_Option1());
                textView4.setText(currentQuestion.getQuestion_Option2());
                textView5.setText(currentQuestion.getQuestion_Option3());
                textView6.setText(currentQuestion.getQuestion_Option4());
                textView7.setText(currentQuestion.getQuestion_Answer());
                Log.d("Ravi", " MainActivity setOnClickListener onClick 5 " + questionid);


                Log.d("Ravi", "DisplayContact onOptionsItemSelected Start 28");
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Do you want to Delete ?");
                builder.setTitle("Alert !");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                db.deleteContactById(id);
                                Toast.makeText(getApplicationContext(), "Deleted Successfully",
                                        Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // User cancelled the dialog
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Are you sure");
                alertDialog.show();
            }
        });

        // add record
//        // get one question
//        int Value = 1;
//        Log.d("Ravi", "Cursor Start 210 ");
//        Cursor rs = db.getData(1);
//        id_To_Update = Value;
////        rs.moveToFirst();
//        Log.d("Ravi", "Cursor Start 211 "+ rs);
//
//        textView.setText(rs.getString(rs.getColumnIndex(Params.Question_KEY_ID)));
//        Log.d("Ravi", " List View 212 " + Question_KEY_ID);
//        textView2.setText(rs.getString(rs.getColumnIndex(Params.Question_Detail)));
//        textView3.setText(rs.getString(rs.getColumnIndex(Params.Question_Option1)));
//        textView4.setText(rs.getString(rs.getColumnIndex(Params.Question_Option2)));
//        textView5.setText(rs.getString(rs.getColumnIndex(Params.Question_Option3)));
//        textView6.setText(rs.getString(rs.getColumnIndex(Params.Question_Option4)));
//        textView7.setText(rs.getString(rs.getColumnIndex(Params.Question_Answer)));
//        Log.d("Ravi", " List View 213 " + Question_Detail);

        // Creating a contact object for the db


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
        // this loop delete records from id 50 to 495 from data base
        for(int i= 50; i<=495; i++){
                    db.deleteContactById(i);
//            Log.d("Ravi", "List Question \nId: " + question.getId() + "\n" +
//                    "Question : " + question.getQuestion_Detail() + "\n" +
//                    "Option 1: " + question.getQuestion_Option1() + "\n" +
//                    "Option 2: " + question.getQuestion_Option2() + "\n" +
//                    "Option 3: " + question.getQuestion_Option3() + "\n" +
//                    "Option 4: " + question.getQuestion_Option4() + "\n" +
//                    "Answer : " + question.getQuestion_Answer() + "\n" );
        }

        // Get all question
        // this line display all record on screen
        List<Question> allQuestions = db.getAllContacts();

        // this loop display all record in logcat
        for(Question question : allQuestions){
            Log.d("Ravi", "List Question Id: " + question.getId() + "Question : " + question.getQuestion_Detail() + "\n" +
                    "Option 1: " + question.getQuestion_Option1() + "Option 2: " + question.getQuestion_Option2() + "Option 3: " + question.getQuestion_Option3() + "Option 4: " + question.getQuestion_Option4() + "Answer : " + question.getQuestion_Answer() + "\n" );
        }
        // count question
        Log.d("Ravi", "You have total "+ db.getCount()+ " Question in your database");

    }

}