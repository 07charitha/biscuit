package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Cs2 extends AppCompatActivity {
    ImageButton img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs2);
        img = (ImageButton) findViewById(R.id.home);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cs2.this, DashboardActivity.class);
                startActivity(i);

            }
        });
    }
}