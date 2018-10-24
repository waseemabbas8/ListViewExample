package com.thetasolutions.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //data source
    String[] studentsNames = {"AHMAD","ALI","WASEEM ABBAS","USMAN","FAISAL","FAHAD"};
    //list view pointer object
    ListView lvStudents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvStudents = findViewById(R.id.lv_students);

        StudentAdapter studentAdapter =new StudentAdapter(this,studentsNames);
        lvStudents.setAdapter(studentAdapter);
    }
}
