package com.getapp.smartcarwash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quickCarWash_button(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void signInLabel(View view) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }

    public void aboutLabel(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void dealsLabel(View view) {
        Intent intent = new Intent(this, Deals.class);
        startActivity(intent);
    }
}
