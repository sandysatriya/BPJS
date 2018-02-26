package com.example.user.bpjskelompok4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CekIuran extends AppCompatActivity {

        private WebView mWebView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.cek_iuran);

            mWebView = new WebView(this);
            mWebView.getSettings().setJavaScriptEnabled(true);

            final Activity activity = this;

            mWebView.setWebViewClient(new WebViewClient());

            mWebView.loadUrl("http://daftar.bpjs-kesehatan.go.id/bpjs-checking/");
            setContentView(mWebView);
            mWebView.getSettings().setBuiltInZoomControls(true);
            mWebView.getSettings().setSupportZoom(true);
        }
}
