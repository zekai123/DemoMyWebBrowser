package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnloadURL;
WebView wvMypage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnloadURL=findViewById(R.id.buttonLoad);
        wvMypage=findViewById(R.id.WebViewMypage);
        wvMypage.setWebChromeClient(new WebChromeClient());
        wvMypage.getSettings().setJavaScriptEnabled(true);
        wvMypage.getSettings().setAllowFileAccess(false);
        wvMypage.getSettings().setBuiltInZoomControls(true);
        
        btnloadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = " https://www.grab.com/sg/";
                wvMypage.loadUrl(url);

            }
        });
    }
}
