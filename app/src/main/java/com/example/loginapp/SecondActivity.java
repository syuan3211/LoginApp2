package com.example.loginapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private ImageView Image;
    private Button Buy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalog);

        Image = findViewById(R.id.imageView3);
        Image = findViewById(R.id.imageView5);
        Image = findViewById(R.id.imageView6);
        Image = findViewById(R.id.imageView7);
        Image = findViewById(R.id.imageView8);

        Buy = findViewById(R.id.button);
        Buy = findViewById(R.id.button2);
        Buy = findViewById(R.id.button3);
        Buy = findViewById(R.id.button4);


    }
}

