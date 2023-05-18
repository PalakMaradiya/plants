package com.example.e_plant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class WelcomeActivity extends AppCompatActivity {

    ImageView imgCart , imgProfile  , imgPlants ,imgcart,imgPots,imgShop;

    CardView cardSearch;

    Button btnDeatlis,btndatils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initview();
    }

    private void initview() {
        imgCart = findViewById(R.id.imgCart);
        btndatils = findViewById(R.id.btndatils);
        imgShop = findViewById(R.id.imgShop);
        cardSearch = findViewById(R.id.cardSearch);
        imgPlants = findViewById(R.id.imgPlants);
        imgPots = findViewById(R.id.imgPots);
        btnDeatlis = findViewById(R.id.btnDeatils);
        imgcart = findViewById(R.id.imgcart);
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

        btnDeatlis . setOnClickListener(new View.OnClickListener() {
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


        cardSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(WelcomeActivity.this,SearchActivity.class);
                startActivity(i);

            }
        });



        imgShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(WelcomeActivity.this,DetialsActivity.class);
                startActivity(i);
            }
        });

        btndatils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(WelcomeActivity.this,DetialsActivity.class);
                startActivity(i);
            }
        });

    }
}