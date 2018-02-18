package com.example.lenovo.ambar_1202154348_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.TextView;
import java.util.ArrayList;
import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.view.View;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //daftar menu makanan
    private String[] Judul = {"beef", "burger", "gurame", "kentang", "pizza", "salad", "sosiz"};
    private String[] test = {"Rp. 50.000", "Rp. 25.000", "Rp. 75.000", "Rp. 30.000", "Rp. 65.000", "Rp. 45.000", "Rp. 45.000"};
    private int[] Gambar = {R.drawable.beef, R.drawable.burger, R.drawable.gurame, R.drawable.kentang, R.drawable.pizza, R.drawable.salad, R.drawable.sosiz};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.list_menu);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        rvView.setAdapter(adapter);

    }

    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }

    }
}
