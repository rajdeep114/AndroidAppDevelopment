package com.getapp.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Event handler at the time app starts
        // Reference to the button
        Button b = (Button) findViewById(R.id.button);

        //****** Event Listener *********
        b.setOnClickListener(
                // Interface : collections of methods
                new Button.OnClickListener() {
                    // call back method
                    public void onClick(View v){
                        TextView text = (TextView) findViewById(R.id.text);
                        text.setText("Hey wassup!!!");

                    }
                }
        );

        b.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView text = (TextView) findViewById(R.id.text);
                        text.setText("Long clicckkkkkkkk");
                        return false;
                    }
                }
        );

    }
}
