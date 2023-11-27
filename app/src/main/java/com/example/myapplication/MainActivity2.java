package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    Integer s1=0;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt=findViewById(R.id.txtRnd);
        Random random = new Random();
        s1= random.nextInt(15)+0;
        txt.setText(s1.toString());
    }

    public void previous(View view) {
        Intent p1 = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(p1);
    }
}