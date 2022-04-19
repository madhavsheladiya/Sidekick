package com.example.project_login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Locale;

public class SimSin4 extends AppCompatActivity {

    private Toolbar toolbar;
    private Button btn_locate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim_sin4);

        toolbar=findViewById(R.id.sim4_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("SIN Location");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_locate=findViewById(R.id.btn_locate);
        btn_locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH, "https://www.google.com/maps/place/400+City+Hall+Square+E,+Windsor,+ON+N9A+7K6/@42.3175345,-83.0353506,18z/data=!4m13!1m7!3m6!1s0x883b2ce1b2d6832f:0x1a9d4d88ce1d7186!2s400+City+Hall+Square+E,+Windsor,+ON+N9A+7K6!3b1!8m2!3d42.3174492!4d-83.0342723!3m4!1s0x883b2ce1b2d6832f:0x1a9d4d88ce1d7186!8m2!3d42.3174492!4d-83.0342723");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });


    }
}