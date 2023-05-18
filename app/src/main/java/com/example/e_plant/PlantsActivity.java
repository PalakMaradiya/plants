package com.example.e_plant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlantsActivity extends AppCompatActivity {

    ImageView imgCart,imgSearch,imgBack;

    Button btnDetalis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants);
        initview();
    }

    private void initview() {

        imgCart = findViewById(R.id.imgCart);
        imgSearch = findViewById(R.id.imgSearch);
        imgBack = findViewById(R.id.imgBack);
        btnDetalis = findViewById(R.id.btnDetalis);
        imgCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(PlantsActivity.this,CartActivity.class);
                startActivity(i);
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent i = new Intent(PlantsActivity.this,WelcomeActivity.class);
                 startActivity(i);
            }
        });


        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(PlantsActivity.this,SearchActivity.class);
                startActivity(i);
            }
        });

        btnDetalis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlantsActivity.this,DetialsActivity.class);
                startActivity(i);
            }
        });
    }
}