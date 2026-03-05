package com.ejemplo.app_cm1

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val webView: WebView = findViewById(R.id.webView)

        val url = intent.getStringExtra("url")

        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        if(url != null){
            webView.loadUrl(url)
        }
    }
}