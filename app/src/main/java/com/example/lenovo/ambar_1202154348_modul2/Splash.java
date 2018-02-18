package com.example.lenovo.ambar_1202154348_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this, "AMBAR_1202154348", Toast.LENGTH_LONG).show();
        Thread thread = new Thread() {
            public void run () {
                try {
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(Splash.this, MenuUtama.class));
                    finish();
                }

            }
        };
        thread.start();
    }
}

