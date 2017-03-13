package com.udacity.gradle.builditbigger.jokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getStringExtra("JOKE");
        TextView jokeTextView = (TextView) findViewById(R.id.jokeText);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
