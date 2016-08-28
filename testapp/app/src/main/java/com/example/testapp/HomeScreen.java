    package com.example.testapp;

    import android.graphics.Color;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.app.Activity;
    import android.util.Log;
    import android.view.View;
    import android.widget.EditText;
    import android.widget.LinearLayout;
    import android.widget.Button;
    import android.content.Intent;
    import android.widget.TextView;

    public class HomeScreen extends AppCompatActivity {

        private final String TAG = "TXT";

        LinearLayout    background;
        Button          submitButton;
        MyDbHandler     dbHandler;
        EditText        bloodP,bloodS,dataCycling,dataWaking,dataWeight,dataRunning;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.linear_layout);

            background      =   (LinearLayout) findViewById(R.id.background);
            submitButton    =   (Button) findViewById(R.id.submitButton);
            bloodP          =   (EditText) findViewById(R.id.bloodP);
            bloodS          =   (EditText) findViewById(R.id.bloodS);
            dataCycling          =   (EditText) findViewById(R.id.bloodS);
            dataWaking          =   (EditText) findViewById(R.id.walking);
            dataWeight          =   (EditText) findViewById(R.id.weight);
            dataRunning          =   (EditText) findViewById(R.id.running);

            dbHandler = new MyDbHandler(this,null,null,1);

            Log.d(TAG, "onCreate");
            submitButton.setOnClickListener(new View.OnClickListener()  {
                @Override
                public void onClick(View view ) {
                    Data entry = new Data(bloodP.getText().toString(),bloodS.getText().toString(),dataCycling.getText().toString(),dataRunning.getText().toString(),dataWaking.getText().toString(),dataWeight.getText().toString());
                    dbHandler.addData(entry);
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
