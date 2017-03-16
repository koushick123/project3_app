package com.udacity.gradle.builditbigger.free;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.udacity.gradle.builditbigger.R;
import com.udacity.gradle.builditbigger.jokelibrary.JokeActivity;
import com.udacity.gradle.builditbigger.paid.sync.EndpointAsyncTask;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    String joke="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchJokeActivity(View view) {
        try {
            joke = new EndpointAsyncTask().execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra("JOKE", joke);
        startActivity(intent);
    }


}
