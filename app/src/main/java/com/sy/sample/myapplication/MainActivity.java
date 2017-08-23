package com.sy.sample.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.MultiCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MultiCallback multiCallback = new MultiCallback();
        GifImageView imageView = (GifImageView)findViewById(R.id.gif_img);
        try {
            GifDrawable gifDrawable = new GifDrawable(getResources(), R.drawable.sample);
            imageView.setImageDrawable(gifDrawable);
            multiCallback.addView(imageView);
            gifDrawable.setCallback(multiCallback);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
