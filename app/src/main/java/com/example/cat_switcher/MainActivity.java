package com.example.cat_switcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean catShowing = true;

    public void switchCat(View view){

        Log.i("Info","Button Pressed");

       ImageView image = (ImageView) findViewById(R.id.catImageView);

        if(catShowing)
        {
            catShowing = false;
            image.setImageResource(R.drawable.cat2);
        }
        else
        {
            catShowing = true;
            image.setImageResource(R.drawable.cat);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
