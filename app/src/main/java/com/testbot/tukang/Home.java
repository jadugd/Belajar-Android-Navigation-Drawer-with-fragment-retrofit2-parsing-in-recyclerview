package com.testbot.tukang;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 30/01/2018.
 */

public class Home extends Fragment {
    View v;
    WebView webView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.home, container, false);

        webView = v.findViewById(R.id.webview);
        webView.loadUrl("https://www.vidio.com/live/778-global-tv-stream");
        WebSettings webset = webView.getSettings();
        webset.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        return v;
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("WebviewHome");
    }
}
