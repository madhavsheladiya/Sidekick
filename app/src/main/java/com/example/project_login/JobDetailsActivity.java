package com.example.project_login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JobDetailsActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private TextView mtitle;
    private TextView mDate;
    private TextView mDescription;
    private TextView mSkills;
    private TextView mSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_details);

        toolbar=findViewById(R.id.toolbar_job_details);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Job Details");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mtitle=findViewById(R.id.job_details_title);
        mDate=findViewById(R.id.job_details_date);
        mDescription=findViewById(R.id.job_details_description);
        mSkills=findViewById(R.id.job_details_skills);
        mSalary=findViewById(R.id.job_details_salary);





    }
}