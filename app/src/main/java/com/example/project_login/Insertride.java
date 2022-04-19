package com.example.project_login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Insertride extends AppCompatActivity {
    private Toolbar toolbar;

    private EditText ride_Name;
    private EditText ride_From;
    private EditText ride_To;
    private EditText ride_On;
    private EditText ride_seats;
    private EditText ride_Luggage_info;
    private EditText ride_contact;
    private EditText ride_Budget;

    private Button btn_request_ride_insert;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_insert_ride);



        btn_request_ride_insert = findViewById(R.id.btn_request_ride_insert);
        Toolbar toolbar = findViewById(R.id.insert_ride_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Ride details");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        InserRide();
    }

    private void InserRide() {
        ride_Name=findViewById(R.id.RR_person_name);
        ride_From=findViewById(R.id.RR_from);
        ride_To=findViewById(R.id.RR_to);
        ride_On=findViewById(R.id.RR_date_on);
        ride_seats=findViewById(R.id.RR_seats);
        ride_Luggage_info=findViewById(R.id.RR_luggage_info);
        ride_contact=findViewById(R.id.RR_contact);
        ride_Budget=findViewById(R.id.RR_Budget);

        btn_request_ride_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=ride_Name.getText().toString().trim();
                String from=ride_From.getText().toString().trim();
                String to=ride_To.getText().toString().trim();
                String date_on=ride_On.getText().toString().trim();
                String seats=ride_seats.getText().toString().trim();
                String luggage_info=ride_Luggage_info.getText().toString().trim();
                String contact=ride_contact.getText().toString().trim();
                String budget=ride_Budget.getText().toString().trim();

                if (TextUtils.isEmpty(name)){
                    ride_Name.setError("Required field..");
                    return;
                }
                if (TextUtils.isEmpty(from)){
                    ride_From.setError("Required field..");
                    return;
                }
                if (TextUtils.isEmpty(to)){
                    ride_To.setError("Required field..");
                    return;
                }
                if (TextUtils.isEmpty(date_on)){
                    ride_On.setError("Required field..");
                    return;

                }
                if (TextUtils.isEmpty(seats)){
                    ride_seats.setError("Required field..");
                    return;
                }
                if (TextUtils.isEmpty(luggage_info)){
                    ride_Luggage_info.setError("Required field..");
                    return;
                }
                if (TextUtils.isEmpty(contact)){
                    ride_contact.setError("Required field..");
                    return;
                }
                if (TextUtils.isEmpty(budget)){
                    ride_Budget.setError("Required field..");
                    return;

                }
                Toast.makeText(getApplicationContext(), "Successful", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getApplicationContext(), Requestride.class));
            }
        });
    }
}
