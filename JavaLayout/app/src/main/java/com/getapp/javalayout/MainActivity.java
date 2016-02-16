package com.getapp.javalayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  // Create a layout
        RelativeLayout relative_layout = new RelativeLayout(this);

        // Create an instance of button
        Button red_button = new Button(this);

        // Adding button to the layout
        // Use addView method in the layout object
        relative_layout.addView(red_button);

        // Setting a specific layout as the main screen
        // use setContentView
        setContentView(relative_layout);
        */
    }
}
