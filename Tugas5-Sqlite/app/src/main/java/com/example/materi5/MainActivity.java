package com.example.materi5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    ListView main;
    public String bhs_prog[]={"Prolog", "C", "C++", "Python", "Java", "Kotlin", "Delphi"};

    Spinner comboitem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = (ListView) findViewById(R.id.list_item);
        comboitem = (Spinner) findViewById(R.id.comboitem);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, bhs_prog);
        comboitem.setAdapter(adapter);
    }
}