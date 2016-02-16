package com.getapp.firstapp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by RajdeepSingh on 2/14/16.
 */

// overide on create method. Connect corresponding java and xml file
public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);
    }
}
