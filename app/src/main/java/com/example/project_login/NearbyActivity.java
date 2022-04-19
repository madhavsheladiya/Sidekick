package com.example.project_login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Locale;

public class NearbyActivity extends AppCompatActivity
{
    private Toolbar toolbar;
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby);

        toolbar=findViewById(R.id.nearby_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Nearby");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        TextView btn_nearby_medical_stores = findViewById(R.id.btn_nearby_medical_stores);
        btn_nearby_medical_stores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=Pharmacies");
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
            startActivity(intent);
        }
        });

        TextView btn_nearby_restaurants = findViewById(R.id.btn_nearby_restaurants);
        btn_nearby_restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=Restaurants");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        TextView btn_nearby_groceries = findViewById(R.id.btn_nearby_groceries);
        btn_nearby_groceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=Groceries");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        TextView btn_nearby_attraction = findViewById(R.id.btn_nearby_attraction);
        btn_nearby_attraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=Attraction");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        TextView btn_nearby_service_canada = findViewById(R.id.btn_nearby_service_canada);
        btn_nearby_service_canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=nearby service canada");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        TextView btn_nearby_service_ontario = findViewById(R.id.btn_nearby_service_ontario);
        btn_nearby_service_ontario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=nearby service ontario");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
    }
}
