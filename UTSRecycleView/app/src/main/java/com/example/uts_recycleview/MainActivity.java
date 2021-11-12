package com.example.uts_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MenuAdapter(listMakanan,this));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Nasi Goreng",
                "Rp. 18.000",
                "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.",
                R.drawable.nasigoreng));

        listMakanan.add(new Makanan("Bakmi Goreng",
                " Rp. 16.000",
                "Mi goreng berarti \"mi yang digoreng\" adalah makanan yang berasal dari Indonesia yang populer dan juga digemari di Malaysia, dan Singapura.",
                R.drawable.bakmigoreng));

        listMakanan.add(new Makanan("Bakmi Godog",
                "Rp. 16.000",
                "Bakmi jawa atau mi jawa adalah bakmi rebus yang dimasak dengan bumbu khas masakan Jawa. Kebanyakan bakmi Jawa adalah bakmi rebus, sehingga di luar negeri bakmi Jawa ini dikenal dengan sebutana mee rebus, akan tetapi sebenarnya terdapat variasi mi goreng dari bakmi Jawa.",
                R.drawable.bakmigoreng));

        listMakanan.add(new Makanan("Kwiteau",
                "Rp. 17.000",
                "Kwetiau goreng adalah kwetiau yang digoreng yang merupakan masakan Tionghoa Indonesia, itu adalah hidangan mie yang digoreng yang beraroma dan pedas yang umum dijumpai di Indonesia.",
                R.drawable.kwiteiau)) ;
    }
}