package com.example.project_login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class HomepageActivity extends AppCompatActivity {
    private Toolbar toolbar;
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

         toolbar = findViewById(R.id.homepage);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sidekick");

        //getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView btn_accomodation = findViewById(R.id.btn_accomodation);
        btn_accomodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AccomodationActivity.class));
            }


        });

        TextView btn_PartTime=findViewById(R.id.btn_PartTime);
        btn_PartTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PartTimeActivity.class));
            }
        });

       TextView btn_CityShare=findViewById(R.id.btn_city_share);
       btn_CityShare.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),RideShareActivity.class));
           }
       });

       TextView btn_service_canada=findViewById(R.id.btn_service_canada);
       btn_service_canada.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),SimSin1.class));
           }
       });

       TextView btn_communtiy_centre=findViewById(R.id.btn_community_center);
       btn_communtiy_centre.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),FaqMainActivity.class));
           }
       });

       TextView btn_Nearby=findViewById(R.id.btn_nearby);
       btn_Nearby.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),NearbyActivity.class));
           }
       });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:
                signout();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private void signout() {
        Toast.makeText(this,"Signed out Successfully",Toast.LENGTH_SHORT).show();
    }
}