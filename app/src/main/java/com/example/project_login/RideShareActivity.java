package com.example.project_login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class RideShareActivity extends AppCompatActivity {
    private Button btn_request_ride;
    private Button btn_Post_ride;
    private Button btn_seeAllRides;
    private Toolbar toolbar;
    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rideshare);

        toolbar = findViewById(R.id.ride_share_home);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Find Your Rides");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        btn_request_ride = findViewById(R.id.btn_request_ride);
        btn_Post_ride = findViewById(R.id.btn_Post_ride);
        btn_seeAllRides=findViewById(R.id.btn_seeAllRides);

        btn_seeAllRides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AllridesActivity.class));
            }
        });


        btn_request_ride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), Requestride.class));
            }
        });
        btn_Post_ride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),Postride.class));
            }
        });
    }
}
