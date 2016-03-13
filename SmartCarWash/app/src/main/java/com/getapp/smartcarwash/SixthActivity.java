package com.getapp.smartcarwash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
    }

    public void next_Button(View view) {
        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);

    }

    public void back_Button(View view) {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }
}
