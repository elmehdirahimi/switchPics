package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.im);
       
    }
    public void next(View view) {

       img.setImageResource(R.drawable.ach);
    }
    public void previous(View view) {
        img.setImageResource(R.drawable.y);
    }
}
