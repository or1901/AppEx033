package com.example.appex033;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int clicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        clicks = 0;
    }

    public void countClicks(View view) {
        clicks++;

        if(clicks != 6)
            btn.setText("This is a click number: " + clicks);
        else{
            btn.setText("Enough to click. Go to new start!");
            clicks = 0;
        }

        }
    }