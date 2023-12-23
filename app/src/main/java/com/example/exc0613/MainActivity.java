package com.example.exc0613;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView text369;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        text369 = findViewById(R.id.text369);    }
    int counter = 0 ;
    public void ace(View view) {
        text369.setTextColor(Color.BLUE);
        counter += 1 ;
        text369.setText("This is a click number:" + counter);
        if (counter == 6)
            counter = 0 ;
    }
}