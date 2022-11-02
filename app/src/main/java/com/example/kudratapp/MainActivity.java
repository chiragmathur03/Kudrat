package com.example.kudratapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
public class MainActivity extends Activity
{

    private WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =  findViewById(R.id.button3);
        final EditText et =  findViewById(R.id.editText4);
        wv1 = (WebView) findViewById(R.id.webView);
     /* String s="<html><body bgcolor=lavender><center>
                  <h1><font color=red>Demo of html in android app</font>
                  </h1><BR><marquee>Demo of marquee</marquee></center></body></html>";
        wv1.loadData(s, "text/html", null); //msg,mime type,encoding

        */

        wv1.setWebViewClient(new WebViewClient());
        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String url ="http://"+et.getText().toString();
                System.out.println("testing block1");
                wv1.loadUrl(url);
            }
        });
    }
    private class MyBrowser extends WebViewClient
    {

    }
}

