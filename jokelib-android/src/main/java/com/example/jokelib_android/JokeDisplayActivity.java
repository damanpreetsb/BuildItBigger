package com.example.jokelib_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public final static String INTENT_KEY = "JOKE_INTENT_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        String joke = getIntent().getStringExtra(INTENT_KEY);
        TextView textViewJoke = (TextView) findViewById(R.id.textview_joke);
        textViewJoke.setText(joke);
    }
}
