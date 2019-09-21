package com.mendoza.lab2mendozaneilarvin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText course1, course2, course3, course4, course5, course6, course7, course8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course1 = findViewById(R.id.editText);
        course2 = findViewById(R.id.editText2);
        course3 = findViewById(R.id.editText3);
        course4 = findViewById(R.id.editText4);
        course5 = findViewById(R.id.editText5);
        course6 = findViewById(R.id.editText6);
        course7 = findViewById(R.id.editText7);
        course8 = findViewById(R.id.editText8);
    }

    public void saveCourse(View v){
        SharedPreferences sp = getSharedPreferences("courseData", MODE_PRIVATE); //cointainer
        SharedPreferences.Editor editor = sp.edit(); //writer
        String courseSP1 = course1.getText().toString();
        String courseSP2 = course2.getText().toString();
        String courseSP3 = course3.getText().toString();
        String courseSP4 = course4.getText().toString();
        String courseSP5 = course5.getText().toString();
        String courseSP6 = course6.getText().toString();
        String courseSP7 = course7.getText().toString();
        String courseSP8 = course8.getText().toString();
        editor.putString("course1", courseSP1);
        editor.putString("course2", courseSP2);
        editor.putString("course3", courseSP3);
        editor.putString("course4", courseSP4);
        editor.putString("course5", courseSP5);
        editor.putString("course6", courseSP6);
        editor.putString("course7", courseSP7);
        editor.putString("course8", courseSP8);
        editor.commit();
        Toast.makeText(this, "Data was saved", Toast.LENGTH_LONG).show();
    }

    public void nextPage(View v){
        Intent i = new Intent(this, Validate.class);
        startActivity(i);
    }
}
