package com.example.project_login;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class InsertJobPostActivity extends AppCompatActivity {



    private Toolbar toolbar;

    private EditText job_title;
    private EditText job_description;
    private EditText job_skills;
    private EditText job_salary;

    private Button btn_post_job;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_job_post);



        btn_post_job = findViewById(R.id.btn_Job_post);

        Toolbar toolbar = findViewById(R.id.insert_job_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Post job");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        InsertJob();
    }

    public void InsertJob(){

        job_title=findViewById(R.id.Job_Title);
        job_description=findViewById(R.id.Job_Description);
        job_skills=findViewById(R.id.Job_Skills);
        job_salary=findViewById(R.id.Job_Salary);

        btn_post_job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String title=job_title.getText().toString().trim();
                String description=job_description.getText().toString().trim();
                String skills=job_skills.getText().toString().trim();
                String salary=job_salary.getText().toString().trim();

                if (TextUtils.isEmpty(title)){
                    job_title.setError("Required field..");
                    return;
                }
                if (TextUtils.isEmpty(description)){
                    job_description.setError("Required field..");
                    return;
                }
                if (TextUtils.isEmpty(skills)){
                    job_skills.setError("Required field..");
                    return;
                }
                if (TextUtils.isEmpty(salary)){
                    job_salary.setError("Required field..");
                    return;

                }






                    Toast.makeText(getApplicationContext(), "Successful", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(getApplicationContext(), PostJobActivity.class));

                }

        });

    }
}