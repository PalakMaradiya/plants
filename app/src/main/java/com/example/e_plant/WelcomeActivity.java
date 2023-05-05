package com.example.e_plant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {

    ImageView imgCart , imgProfile  , imgPlants ,imgcart,imgPots;

    Button btnDeatils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initview();
    }

    private void initview() {
        imgCart = findViewById(R.id.imgCart);
        imgPlants = findViewById(R.id.imgPlants);
        imgPots = findViewById(R.id.imgPots);
        btnDeatils = findViewById(R.id.btnDeatils);
        imgcart = findViewById(R.id.imgcart);
        btnDeatils = findViewById(R.id.btnDeatils);
        imgProfile = findViewById(R.id.imgProfile);
        imgCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WelcomeActivity.this,CartActivity.class);
                startActivity(i);
            }
        });

        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WelcomeActivity.this,ProfileActivity.class);
                startActivity(i);
            }
        });

        imgPlants . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(WelcomeActivity.this,PlantsActivity.class);
                startActivity(i);
            }
        });


        imgcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(WelcomeActivity.this,CartActivity.class);
                startActivity(i);
            }
        });


        imgPlants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(WelcomeActivity.this,PlantsActivity.class);
                startActivity(i);
            }
        });

        btnDeatils . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(WelcomeActivity.this,DetialsActivity.class);
                startActivity(i);
            }
        });


        imgPots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(WelcomeActivity.this,DetialsActivity.class);
                startActivity(i);
            }
        });

    }
}