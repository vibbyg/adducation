package com.example.adducation.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.example.adducation.R;

import java.util.*;

public class Courses extends AppCompatActivity implements View.OnClickListener{
    private ViewGroup coursesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        coursesView = (ViewGroup) findViewById(R.id.newButton);
//        ActionBar aB = getActionBar();
//        aB.setDisplayHomeAsUpEnabled(true);

        Button addCourse = (Button) findViewById(R.id.addCourse);
        Button deleteCourse = (Button) findViewById(R.id.deleteCourse);

        ListView listView = findViewById(R.id.listview);
        List<String> list = new ArrayList<>();

//        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
//        listView.setAdapter(arrayAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnClickListener());
//            @Override
//            public void onClick(View view) {
//                displayCourse();
//            }
//        };

        addCourse.setOnClickListener(this);
        deleteCourse.setOnClickListener(this);

    }

//    public boolean onOptionsItemSelected(MenuItem it){
//        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//        startActivity(intent);
//        return true;
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.addCourse:
                addButton();
//                createCourse();
                break;
            case R.id.deleteCourse:
                removeCourse();
                break;
            case R.id.back2:
                returnBack();
                break;
        }
    }

    private void returnBack() {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }

    private void addButton() {
        Button course = new Button(Courses.this);
//        RelativeLayout.LayoutParams params =
//                new RelativeLayout.LayoutParams
//                        (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        params.addRule(RelativeLayout., R.id.textView2);

        course.getEditableText();

        coursesView.addView(course, RelativeLayout.BELOW, R.id.textView2);
    }

    private void displayCourse() {
        Intent intent1 = new Intent(this, Course.class);
        startActivity(intent1);
    }

    private void createCourse() {
        // leads the user to a Course page where they can input the course name, assignments, etc.
        Intent intent2 = new Intent(this, Course.class);
        startActivity(intent2);
    }

    private void removeCourse() {
        // prompts the reader to select which course they wish to delete.
    }
}