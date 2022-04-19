package com.example.project_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SimSin1 extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim_sin1);
        toolbar=findViewById(R.id.sim1_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Service Canada");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();

            }

        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity3();

            }

        });

    }
    public void openActivity2() {
        Intent intent = new Intent(this, SimSin2.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, SimSin3.class);
        startActivity(intent);
    }
}


