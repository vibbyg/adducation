package com.example.adducation.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.example.adducation.R;

import java.util.*;

public class Courses extends AppCompatActivity{
    private ViewGroup coursesView;
    private int Counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        coursesView = (ViewGroup) findViewById(R.id.newButton);
        Counter = 0;

        Button addCourse = (Button) findViewById(R.id.addCourse);
        addCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter += 1;
                addButton(Counter);

            }
        });
        Button deleteCourse = (Button) findViewById(R.id.deleteCourse);
        Button back = (Button) findViewById(R.id.back);

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


        deleteCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeCourse();

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();

            }
        });

    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.addCourse:
//                addButton();
////                createCourse();
//                break;
//            case R.id.back:
//                goBack();
//                break;
//            case R.id.deleteCourse:
//                removeCourse();
//                break;
//        }
//    }

    private void addButton(int i) {
        Button course = new Button(Courses.this);
//        RelativeLayout.LayoutParams params =
//                new RelativeLayout.LayoutParams
//                        (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
//        params.addRule(RelativeLayout.BELOW, R.id.textView2);
        if (course.getParent() != null) {
            ((ViewGroup) course.getParent()).removeView(course);

            for (i = 0; i < coursesView.getHeight(); i *= 10) {
                course.setText("Course");
                int height = i;
                int width = coursesView.getWidth() / 2;

                coursesView.addView(course, width, height);
            }
        }
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

    private void goBack() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}