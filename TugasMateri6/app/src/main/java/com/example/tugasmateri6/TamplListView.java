package com.example.tugasmateri6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TamplListView extends AppCompatActivity {
    BantuDatabase bd;
    public static ListView listView;
    public static EditText editText;
    Button tomboltambah;

    ArrayAdapter adapter;

    ArrayList<String> listviewku;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampl_list_view);

        listView=findViewById(R.id.listdatabuah);
        editText=findViewById(R.id.databuah);
        tomboltambah=findViewById(R.id.tomboltambah);
        bd=new BantuDatabase(this);
        listviewku=new ArrayList<>();
        tampilkan_buah();

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long l) {
                final String noid=listviewku.get(position);
                final String nomor=noid.substring(0,2);
                //editText.setText(nomor.toString());
                new AlertDialog.Builder(TamplListView.this)
                        .setTitle("Perhatian !")
                        .setMessage("Hapus Data ?")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                bd.hapusRecord(Integer.parseInt(nomor));
                                listviewku.remove(position);
                                listView.invalidateViews();
                            }
                        })
                        .setNegativeButton("no",null)
                        .show();
                return false;
            }
        });
        tomboltambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd.tambahData(editText.getText().toString());
                Toast.makeText(TamplListView.this, "Data Tersimpan", Toast.LENGTH_SHORT).show();
                listviewku.clear();
                tampilkan_buah();
            }
        });
    }

    private void tampilkan_buah() {
        Cursor cursor=bd.tampilBuah();
        if (cursor.getCount()==0)
        {
            Toast.makeText(this, "Kosong", Toast.LENGTH_SHORT).show();
        }else{
            while (cursor.moveToNext())
            {
                listviewku.add(String.valueOf(cursor.getInt(0))+" "+cursor.getString(1));
            }
            adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,listviewku);
            listView.setAdapter(adapter);
        }
    }
}