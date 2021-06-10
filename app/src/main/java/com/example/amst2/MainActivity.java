package com.example.amst2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void youtube (View view){
        Intent cambioVentana = new Intent(MainActivity.this, youtubeVentana.class);
        startActivity(cambioVentana);
        finish();
    }

    public void calendario (View view){
        Intent cambioVentana = new Intent(MainActivity.this, calendarioVentana.class);
        startActivity(cambioVentana);
        finish();
    }

    public void mapa (View view){
        Intent cambioVentana = new Intent(MainActivity.this, mapaVentana.class);
        startActivity(cambioVentana);
        finish();
    }

    public void grafica (View view){
        Intent cambioVentana = new Intent(MainActivity.this, graficoLinealVentana.class);
        startActivity(cambioVentana);
        finish();
    }

}