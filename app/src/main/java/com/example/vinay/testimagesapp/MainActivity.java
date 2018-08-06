package com.example.vinay.testimagesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    private long start1;
    private long start2;
    private long start3;
    private long start4;
    private long start5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download1();
                download2();
                download3();
                download4();
                download5();
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
                    ((TextView) findViewById(R.id.info1)).setText("Image 1: " + (duration));
                    download1();
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    ((TextView) findViewById(R.id.info1)).setText("Image 1 failed");
                    download1();
                }
            });
        }


    }

    private void download2() {
        if (!((TextView) findViewById(R.id.img2)).getText().toString().trim().equals("")) {
            start2 = System.currentTimeMillis();
            new AsyncHttpClient().get(((TextView) findViewById(R.id.img2)).getText().toString().trim(), new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    long duration = System.currentTimeMillis() - start2;
                    ((TextView) findViewById(R.id.info2)).setText("Image 2: " + (duration));
                    download2();
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    ((TextView) findViewById(R.id.info2)).setText("Image 2 failed");
                    download2();
                }
            });
        }

    }

    private void download3() {
        if (!((TextView) findViewById(R.id.img3)).getText().toString().trim().equals("")) {
            start3 = System.currentTimeMillis();
            new AsyncHttpClient().get(((TextView) findViewById(R.id.img3)).getText().toString().trim(), new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    long duration = System.currentTimeMillis() - start3;
                    ((TextView) findViewById(R.id.info3)).setText("Image 3: " + (duration));
                    download3();
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    ((TextView) findViewById(R.id.info3)).setText("Image 3 failed");
                    download3();
                }
            });
        }


    }

    private void download4() {
        if (!((TextView) findViewById(R.id.img4)).getText().toString().trim().equals("")) {
            start4 = System.currentTimeMillis();
            new AsyncHttpClient().get(((TextView) findViewById(R.id.img4)).getText().toString().trim(), new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    long duration = System.currentTimeMillis() - start4;
                    ((TextView) findViewById(R.id.info4)).setText("Image 4: " + (duration));
                    download4();
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    ((TextView) findViewById(R.id.info4)).setText("Image 4 failed");
                    download4();
                }
            });
        }


    }

    private void download5() {
        if (!((TextView) findViewById(R.id.img5)).getText().toString().trim().equals("")) {
            start5 = System.currentTimeMillis();
            new AsyncHttpClient().get(((TextView) findViewById(R.id.img5)).getText().toString().trim(), new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    long duration = System.currentTimeMillis() - start5;
                    ((TextView) findViewById(R.id.info5)).setText("Image 5: " + (duration));
                    download5();
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    ((TextView) findViewById(R.id.info5)).setText("Image 5 failed");
                    download5();
                }
            });
        }


    }
}
