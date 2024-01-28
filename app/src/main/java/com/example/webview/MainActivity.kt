package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


//A WebView is used to show webpage information from inside an application
//useful for apps which will require to show some information via a web browser website directly


class MainActivity : AppCompatActivity() {

    lateinit var webView : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.web)

        //this opens up the weblink provided via the browser in the webView
        //but we also need to write the permissions code for internet connection and browsing
        //this permissions is done in the .manifest file
        webView.webViewClient = WebViewClient()
        webView.loadUrl("http://www.google.com")
    }

    //this method enables the backbutton to return to the application view
    //and also previous web pages like a back button in an actual browser
    override fun onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack()
        }else{
            super.onBackPressed()
        }
    }
}