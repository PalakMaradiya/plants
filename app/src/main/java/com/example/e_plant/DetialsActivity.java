package com.example.e_plant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetialsActivity extends AppCompatActivity {

    Button btnCare , btnReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detials);
        initview();

    }

    private void initview() {

        btnCare = findViewById(R.id.btnCare);
        btnReview = findViewById(R.id.btnReview);

        btnCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DetialsActivity.this,CartActivity.class);
                startActivity(i);
            }
        });

        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DetialsActivity.this,ReviewActivity.class);
                startActivity(i);
            }
        });
    }
}