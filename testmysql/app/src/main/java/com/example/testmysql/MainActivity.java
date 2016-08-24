package com.example.testmysql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button addButton;
    Button removeButton;

    MyDbHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText  = (EditText) findViewById(R.id.editText);
        textView  = (TextView) findViewById(R.id.textView);
        addButton = (Button) findViewById(R.id.addButton);
        removeButton = (Button) findViewById(R.id.removeButton);

        dbHandler = new MyDbHandler(this,null,null,1);
        printDatabase();

        addButton.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view ) {
                Products product = new Products(editText.getText().toString());
                dbHandler.addProduct(product);
                printDatabase();
            }
        });

        removeButton.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view ) {
                dbHandler.delProduct(textView.getText().toString());
                printDatabase();
            }
        });

    }

    public void printDatabase() {
        String dbstring = dbHandler.dbToString();
        textView.setText(dbstring);
        editText.setText("");
    }
}
