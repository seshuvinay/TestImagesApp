package com.example.vinay.testimagesapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    private long start1;
    private long start2;
    private long start3;
    ScrollView scroll1, scroll2, scroll3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scroll1 = findViewById(R.id.scroll1);
        scroll2 = findViewById(R.id.scroll2);

        scroll3 = findViewById(R.id.scroll3);

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download1();
                download2();
                download3();

                findViewById(R.id.submit).setVisibility(View.GONE);
            }
        });
    }

    private void download1() {
        if (!((TextView) findViewById(R.id.img1)).getText().toString().trim().equals("")) {
            start1 = System.currentTimeMillis();
            new AsyncHttpClient().get(((TextView) findViewById(R.id.img1)).getText().toString().trim(), new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    long duration = System.currentTimeMillis() - start1;
                    String text = ((TextView) findViewById(R.id.info1)).getText().toString();
                    ((TextView) findViewById(R.id.info1)).setText(text + "\nImage 1: " + (duration));
                    scroll1.fullScroll(View.FOCUS_DOWN);
                    download1();
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    String text = ((TextView) findViewById(R.id.info1)).getText().toString();
                    ((TextView) findViewById(R.id.info1)).setText(text + "\nImage 1 failed" + statusCode);
                    scroll1.fullScroll(View.FOCUS_DOWN);
                    download1();
                }
            });
        } else {
            String text = ((TextView) findViewById(R.id.info1)).getText().toString();

            ((TextView) findViewById(R.id.info1)).setText(text + "\nImage 1 empty");
            scroll1.fullScroll(View.FOCUS_DOWN);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    download1();
                }
            },1000);
        }


    }

    private void download2() {
        if (!((TextView) findViewById(R.id.img2)).getText().toString().trim().equals("")) {
            start2 = System.currentTimeMillis();
            new AsyncHttpClient().get(((TextView) findViewById(R.id.img2)).getText().toString().trim(), new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    long duration = System.currentTimeMillis() - start2;
                    String text = ((TextView) findViewById(R.id.info2)).getText().toString();

                    ((TextView) findViewById(R.id.info2)).setText(text + "\nImage 2: " + (duration));
                    scroll2.fullScroll(View.FOCUS_DOWN);
                    download2();
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    String text = ((TextView) findViewById(R.id.info2)).getText().toString();

                    ((TextView) findViewById(R.id.info2)).setText(text + "\nImage 2 failed" + statusCode);
                    scroll2.fullScroll(View.FOCUS_DOWN);
                    download2();
                }
            });
        } else {
            String text = ((TextView) findViewById(R.id.info2)).getText().toString();

            ((TextView) findViewById(R.id.info2)).setText(text + "\nImage 2 empty");
            scroll2.fullScroll(View.FOCUS_DOWN);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    download2();
                }
            },1000);
        }

    }

    private void download3() {
        if (!((TextView) findViewById(R.id.img3)).getText().toString().trim().equals("")) {
            start3 = System.currentTimeMillis();
            new AsyncHttpClient().get(((TextView) findViewById(R.id.img3)).getText().toString().trim(), new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    long duration = System.currentTimeMillis() - start3;
                    String text = ((TextView) findViewById(R.id.info3)).getText().toString();

                    ((TextView) findViewById(R.id.info3)).setText(text + "\nImage 3: " + (duration));
                    scroll3.fullScroll(View.FOCUS_DOWN);
                    download3();
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    String text = ((TextView) findViewById(R.id.info3)).getText().toString();

                    ((TextView) findViewById(R.id.info3)).setText(text + "\nImage 3 failed" + statusCode);
                    scroll3.fullScroll(View.FOCUS_DOWN);
                    download3();
                }
            });
        } else {
            String text = ((TextView) findViewById(R.id.info3)).getText().toString();

            ((TextView) findViewById(R.id.info3)).setText(text + "\nImage 3 empty");
            scroll3.fullScroll(View.FOCUS_DOWN);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    download3();
                }
            },1000);
        }


    }


}
