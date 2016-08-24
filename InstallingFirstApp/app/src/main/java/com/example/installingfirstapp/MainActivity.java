package com.example.installingfirstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout     background;
    Button           goGreen,goRed,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.background_layout);

        background  =   (LinearLayout) findViewById(R.id.background);
        goGreen     =   (Button)    findViewById(R.id.goGreen);
        goRed       =   (Button)    findViewById(R.id.goRed);
        reset       =   (Button)    findViewById(R.id.reset);

        goGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // listener Code
                background.setBackgroundColor(Color.parseColor("#98FF98"));
            }
        });
        goRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // listener Code
                background.setBackgroundColor(Color.parseColor("#FF545F"));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // listener Code
                background.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        });

    }
}
