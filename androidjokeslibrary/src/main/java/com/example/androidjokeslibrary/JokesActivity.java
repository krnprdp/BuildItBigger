package com.example.androidjokeslibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Pradeep on 4/28/16.
 */
public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_layout);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(joke);
    }
}
