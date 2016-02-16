package com.getapp.buttonclickevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    TextView message;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (TextView) findViewById(R.id.text);

        // Another way of writing a on click listner
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View view) {
                 Toast.makeText(getBaseContext(), "You clicked second button", Toast.LENGTH_SHORT).show();
             }
        });
    }

    // On click methods are always public and their return type is void
    public void buttonClicked(View view) {
        // Toast is a kind of a pop you see when the user performs an action.

        //                                  Text to be displayed        Duration        show/hide
        Toast.makeText(getBaseContext(), "You clicked first button", Toast.LENGTH_SHORT).show();
    }
}
