package com.example.adducation.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.ToggleButton;

import com.example.adducation.R;

public class Grades extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);
        ToggleButton edit = (ToggleButton) findViewById(R.id.editGrades);
        Button addRow = (Button) findViewById(R.id.addRow);


        edit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton editButton, boolean checked) {
                if (checked) {
                    editTable();
                    addRow.setCursorVisible(true);
                } else {

                }
            }
        });
    }

    private void editTable() {

    }

    @Override
    public void onClick(View view) {
        addRow();
    }

    private void addRow() {
        TableLayout tbl = (TableLayout) findViewById(R.id.tbL);
        TableRow tr = new TableRow(this);
        tr.addView(new EditText(this));
        tbl.addView(tr);
    }
}