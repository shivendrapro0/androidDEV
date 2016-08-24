    package com.example.testapp;

    import android.graphics.Color;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.app.Activity;
    import android.util.Log;
    import android.view.View;
    import android.widget.LinearLayout;
    import android.widget.Button;
    import android.content.Intent;

    public class HomeScreen extends AppCompatActivity {

//        private final String TAG = "TXT";

        LinearLayout    background;
        Button          submitButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.linear_layout);

            background      =   (LinearLayout) findViewById(R.id.background);
            submitButton    =   (Button) findViewById(R.id.submitButton);

            submitButton.setOnClickListener(new View.OnClickListener()  {

                @Override
                public void onClick(View view ) {
                    Intent i = new Intent(HomeScreen.this, ViewData.class);
                    startActivity(i);
                }
            });

        }

        /*
        @Override
        protected void onStart() {
            super.onStart();
            Log.d(TAG, "onStart");

        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d(TAG, "onRestart");

        }
        @Override
        protected void onResume() {
            super.onResume();
            Log.d(TAG, "onResume");

        }
        @Override
        protected void onPause() {
            super.onPause();
            Log.d(TAG, "onPause");

        }

        */

    }
