package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView5);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opnemenu();
            }
        });

    }
    private void opnemenu(){
        Intent intent = new Intent(this, menu_Activity.class);
        startActivity(intent);
    }
}
