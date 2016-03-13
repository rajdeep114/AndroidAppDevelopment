package com.getapp.smartcarwash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void next_Button(View view) {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    public void back_Button(View view) {
        Intent intent = new Intent(this, Third_Activity.class);
        startActivity(intent);
    }
}
