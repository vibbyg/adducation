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
        edit.setChecked(true);
        Button addRow = (Button) findViewById(R.id.addRow);


        edit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton editButton, boolean checked) {
                if (editButton.isChecked()) {
                    // toggle is enabled
                    editTable();
                    addRow.setCursorVisible(true);
                } else {
                    // toggle is disabled. Do nothing
                }
            }
        });
    }

    private void editTable() {

    }

    @Override
    public void onClick(View v) {
        addRow();
    }

    private void addRow() {
        TableLayout tbl = (TableLayout) findViewById(R.id.tbL);
        TableRow tr = new TableRow(this);
        tr.addView(new EditText(this));
        tbl.addView(tr);
    }
}