package com.example.lessonscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentList extends AppCompatActivity {

    Button popSubmitStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        popSubmitStudent = (Button) findViewById(R.id.popSubmitStudent);
        popSubmitStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubmitStudent.class);
                startActivity(intent);
            }
        });
    }
}