package com.example.project_login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PartTimeActivity extends AppCompatActivity{
    private Button btnAlljob;
    private Button btnPostjob;
    private Toolbar toolbar;
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parttime);

        toolbar=findViewById(R.id.toolbar_home);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Find Part time");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        btnAlljob=findViewById(R.id.btnAlljob);
        btnPostjob=findViewById(R.id.btnPostjob);

        btnAlljob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),AllJobActivity.class));
            }
        });

        btnPostjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),PostJobActivity.class));
            }
        });

}
}
