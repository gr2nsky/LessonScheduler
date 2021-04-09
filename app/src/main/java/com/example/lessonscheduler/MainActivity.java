package com.example.lessonscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goCalendar;
    Button goStudentChart;
    Button goStudentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLayoutItem();
        setClickEvent();
    }



    void setLayoutItem(){
        goCalendar = (Button) findViewById(R.id.goCalendar);
        goStudentChart = (Button) findViewById(R.id.goStudentChart);
        goStudentList = (Button) findViewById(R.id.goStudentList);
    }

    void setClickEvent(){
        goCalendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Calendar.class);
                startActivity(intent);
            }
        });
        goStudentChart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StudentChart.class);
                startActivity(intent);
            }
        });
        goStudentList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StudentList.class);
                startActivity(intent);
            }
        });
    }

}