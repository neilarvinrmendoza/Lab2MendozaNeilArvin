package com.mendoza.lab2mendozaneilarvin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Validate extends AppCompatActivity {

    EditText compCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate);
        setTitle("Validate");
        compCourse = findViewById(R.id.editText9);
    }

    public void prevPage(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("courseData", MODE_PRIVATE); //cointainer
        String courseSP1 = sp.getString("course1", null);
        String courseSP2 = sp.getString("course2", null);
        String courseSP3 = sp.getString("course3", null);
        String courseSP4 = sp.getString("course4", null);
        String courseSP5 = sp.getString("course5", null);
        String courseSP6 = sp.getString("course6", null);
        String courseSP7 = sp.getString("course7", null);
        String courseSP8 = sp.getString("course8", null);

        String userCourse = compCourse.getText().toString();

        if(userCourse.equals(courseSP1) || userCourse.equals(courseSP2) || userCourse.equals(courseSP3) || userCourse.equals(courseSP4) || userCourse.equals(courseSP5) || userCourse.equals(courseSP6) || userCourse.equals(courseSP7) || userCourse.equals(courseSP8)){
            Toast.makeText(this, "Valid Course", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Invalid Course", Toast.LENGTH_LONG).show();
        }
    }
}
