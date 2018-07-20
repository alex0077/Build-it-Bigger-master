package com.example.android.showjokeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String INTENT_JOKE="joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = getIntent();
        TextView jokeview=(TextView)findViewById(R.id.tv_joke);
        String joke = null;
        joke=intent.getStringExtra(INTENT_JOKE);
        if (joke != null){
            jokeview.setText(joke);
        }else {
            jokeview.setText(R.string.no_joke_string);
        }
    }
}
