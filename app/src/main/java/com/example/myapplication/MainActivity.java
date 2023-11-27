package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.txtCount);

    }

    public void toast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }

    Integer s1=0;
    public void count(View view) {
        s1++;
        txt.setText(s1.toString());

    }

    public void random(View view) {
        Intent n1 = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(n1);


    }
}