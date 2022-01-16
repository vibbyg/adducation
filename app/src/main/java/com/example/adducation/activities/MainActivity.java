package com.example.adducation.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.adducation.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewGroup rootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootView = (ViewGroup) findViewById(R.id.newButton);


        Button term1 = (Button) findViewById(R.id.term1);
        Button term2 = (Button) findViewById(R.id.term2);
        Button add = (Button) findViewById(R.id.addTerm);
        Button term3 = (Button) findViewById(R.id.newButton);

        term1.setOnClickListener(this);
        term2.setOnClickListener(this);
        add.setOnClickListener(this);
        term3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.term1:
                openCourses();
                break;
            case R.id.term2:
                openCourses2();
                break;
            case R.id.addTerm:
                addButton();
                openCourses3();
                break;
            case R.id.newButton:
                openCourses3();
                break;
        }
    }

    private void openCourses3() {
        Intent intent3 = new Intent(this, Courses.class);
        startActivity(intent3);
    }

    private void addButton() {
        Button term3 = new Button(MainActivity.this);
        RelativeLayout.LayoutParams params =
                new RelativeLayout.LayoutParams
                        (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.BELOW, R.id.term2);
        term3.setText("TERM 3");
        rootView.addView(term3, params);
    }

    private void openCourses2() {
        Intent intent2 = new Intent(this, Courses.class);
        startActivity(intent2);
    }

    private void openCourses() {
        Intent intent1 = new Intent(this, Courses.class);
        startActivity(intent1);
    }
}