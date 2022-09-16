package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        t = findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                t.setText("Hello World");
            }
        });
    }
}