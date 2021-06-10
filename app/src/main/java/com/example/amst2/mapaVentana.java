package com.example.amst2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mapaVentana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_ventana);
        WebView webView1 = (WebView) findViewById(R.id.webView2);
        WebSettings conf = webView1.getSettings();
        conf.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://www.google.com.ec/maps?hl=es");
    }

    public void ventanaPrincipal (View view){
        Intent cambioVentana = new Intent(mapaVentana.this, MainActivity.class);
        startActivity(cambioVentana);
        finish();
    }
}