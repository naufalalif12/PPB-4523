package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    TextView numberkonter;
    int angka =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberkonter=findViewById(R.id.konter);
    }

    public void timeklik(View view) {
        Toast.makeText(this, "this is a toast", Toast.LENGTH_LONG).show();
    }

    private void show() {
    }

    public void hitungc(View view) {
        angka=angka+1;
        numberkonter.setText(Integer.toString(angka));
    }
}