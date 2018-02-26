package com.example.user.bpjskelompok4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FasKes extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fas_kes);


            mWebView = new WebView(this);
            mWebView.getSettings().setJavaScriptEnabled(true);

            final Activity activity = this;

            mWebView.setWebViewClient(new WebViewClient());

            mWebView.loadUrl("http://faskes.bpjs-kesehatan.go.id/aplicares/");
            setContentView(mWebView);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setSupportZoom(true);
    }
}
