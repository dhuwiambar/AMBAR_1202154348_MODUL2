package com.example.lenovo.ambar_1202154348_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MenuUtama extends AppCompatActivity {

    private RadioGroup rd;
    private RadioButton DineIIn;
    private RadioButton TakeAAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        DineIIn = findViewById(R.id.rb_DineIn);
        TakeAAway = findViewById(R.id.rb_TakeAway);
        rd = findViewById(R.id.rd);
    }

    public void showProcess(View view) {
        int selecteditem = rd.getCheckedRadioButtonId();
        DineIIn = findViewById(R.id.DineIIn);
        TakeAAway = findViewById(R.id.TakeAAway);
        rd = findViewById(R.id.rd);

        if (selecteditem == DineIIn.getId()) {
            Intent pindah = new Intent(MenuUtama.this,DineIn.class);
            startActivity(pindah);
            Toast.makeText(MenuUtama.this, "Dine In", Toast.LENGTH_SHORT).show();
        } else if (selecteditem == TakeAAway.getId()) {
            Intent pindah = new Intent(MenuUtama.this,TakeAway.class);
            startActivity(pindah);
            Toast.makeText(MenuUtama.this, "Take Away", Toast.LENGTH_SHORT).show();

        }
    }
}