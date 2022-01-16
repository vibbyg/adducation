package com.example.adducation.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.*;
import com.example.adducation.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        Button gradesBtn = (Button) findViewById(R.id.gradesButton);
        Button backBtn = (Button) findViewById(R.id.backButton);
        FloatingActionButton addBtn = (FloatingActionButton) findViewById(R.id.addAssignment);
        FloatingActionButton deleteBtn = (FloatingActionButton) findViewById(R.id.deleteAssignment);
        ListView assignmentView = (ListView) findViewById(R.id.scrollAssignments);
        ArrayList<String> assignmentList = new ArrayList<String>();



        gradesBtn.setOnClickListener(this::onClick);
        backBtn.setOnClickListener(this::onClick);
        addBtn.setOnClickListener(this::onClick);
        deleteBtn.setOnClickListener(this::onClick);


    }


    public void onClick(View view){
        switch(view.getId()){
            case R.id.gradesButton:
                openActivity("Grades");
                break;
            case R.id.backButton:
                openActivity("Courses");
                break;
            case R.id.addAssignment:

                openActivity("Assignment");
                break;
            case R.id.deleteAssignment:
                openActivity("Courses");
                break;
        }
    }

    private void openActivity(String className){
        Intent intent1;
        switch(className){
            case "Grades":
                intent1 = new Intent(this, Grades.class);
                startActivity(intent1);
                break;
            case "Courses":
                intent1 = new Intent(this, Courses.class);
                startActivity(intent1);
                break;
            case "Assignment":
                intent1 = new Intent(this, Assignment.class);
                startActivity(intent1);
                break;
            case "BackBtn":
                intent1 = new Intent(this, Courses.class);
                startActivity(intent1);
                break;

        }
    }

}