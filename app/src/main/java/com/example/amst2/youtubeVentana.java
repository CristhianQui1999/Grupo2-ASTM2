package com.example.amst2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class youtubeVentana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_ventana);
        WebView webView1 = (WebView) findViewById(R.id.webView1);
        WebSettings conf = webView1.getSettings();
        conf.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://youtube.com");

    }

    public void ventanaPrincipal (View view){
        Intent cambioVentana = new Intent(youtubeVentana.this, MainActivity.class);
        startActivity(cambioVentana);
        finish();
    }
}