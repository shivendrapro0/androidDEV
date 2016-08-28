package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.widget.LinearLayout;

/**
 * Created by shivendrasharma on 8/21/16.
 */
public class ViewData extends Activity {

    Button  buttonviewD;
    TextView    viewD;

    MyDbHandler     dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_data);

        buttonviewD =   (Button) findViewById(R.id.buttonviewD);
        viewD   =   (TextView)    findViewById(R.id.viewD);
        dbHandler = new MyDbHandler(this,null,null,1);

        buttonviewD.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view ) {
                printDatabase();
            }
        });

    }

    public void printDatabase() {
        String dbstring = dbHandler.dbToString();
        viewD.setText(dbstring);
    }

}
