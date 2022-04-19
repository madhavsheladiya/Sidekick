package com.example.project_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SimSin3 extends AppCompatActivity {

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim_sin3);
        toolbar=findViewById(R.id.sim3_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("SIN Services");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity4();

            }

        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity5();

            }

        });

    }
    public void openActivity4() {
        Intent intent = new Intent(this, SimSin4.class);
        startActivity(intent);
    }
    public void openActivity5() {
        Intent intent = new Intent(this, SimSin5.class);
        startActivity(intent);
    }
}