package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double angkaPertama, angkaKedua, hasil;
    String sAngkaPertama, sAngkaKedua;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    EditText edtAngkaPertama, edtAngkaKedua;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTambah = (Button)findViewById(R.id.btn_tambah);
        btnKurang = (Button)findViewById(R.id.btn_kurang);
        btnKali = (Button)findViewById(R.id.btn_kali);
        btnBagi = (Button)findViewById(R.id.btn_bagi);
        edtAngkaPertama = (EditText)findViewById(R.id.edtAngka_1);
        edtAngkaKedua = (EditText)findViewById(R.id.edtAngka_2);
        txtHasil = (TextView)findViewById(R.id.text_view_hasil);


        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama-angkaKedua;
                txtHasil.setText("Hasil dari "+angkaPertama+" - "+angkaKedua+" = "+hasil);
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama*angkaKedua;
                txtHasil.setText("Hasil dari "+angkaPertama+" x "+angkaKedua+" = "+hasil);
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama/angkaKedua;
                txtHasil.setText("Hasil dari "+angkaPertama+" / "+angkaKedua+" = "+hasil);
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama+angkaKedua;
                txtHasil.setText("Hasil dari "+angkaPertama+" + "+angkaKedua+" = "+hasil);
            }
        });
    }
}