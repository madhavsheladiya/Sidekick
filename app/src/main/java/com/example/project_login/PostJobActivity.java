package com.example.project_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PostJobActivity extends AppCompatActivity {

    private FloatingActionButton fabBtn;

    private Toolbar toolbar;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_job);

        toolbar=findViewById(R.id.toolbar_post_job);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Post Job Details");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fabBtn=findViewById(R.id.PJ_fab_add);

        recyclerView=findViewById(R.id.recycler_job_post_id);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);
        layoutManager.setReverseLayout(true);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        fabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),InsertJobPostActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        View myview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myview=itemView;
        }

        public void setJobTitle(String title){

            TextView mTitle=myview.findViewById(R.id.job_title);
            mTitle.setText(title);
        }

        public void setJobDate(String date){
            TextView mDate=myview.findViewById(R.id.job_date);
            mDate.setText(date);
        }

        public void setJobDescription(String description){

            TextView mDescription=myview.findViewById(R.id.job_description);
            mDescription.setText(description);
        }

        public void setJobSkills(String skills){

            TextView mSkills=myview.findViewById(R.id.job_skills);
            mSkills.setText(skills);
        }

        public void setJobSalary(String salary){

            TextView mSalary=myview.findViewById(R.id.job_salary);
            mSalary.setText(salary);
        }
    }
}