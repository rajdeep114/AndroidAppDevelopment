package com.getapp.java_demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ********** LAYOUT ***********
        // Create a new layout object
        RelativeLayout relative_layout = new RelativeLayout(this);

        // Change background color
        relative_layout.setBackgroundColor(Color.GREEN);


        // ********** BUTTON ***********
        // Create a new button object
        Button redButton = new Button(this);


        // USERNAME INPUT
        EditText username = new EditText(this);

        // SET ID
        redButton.setId(1);
        username.setId(2);

        // LayoutParam: set of rule for the layout -- They can be applied to specific objects
        // This is equavilant to making a container
        RelativeLayout.LayoutParams buttonDetail = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,                       // automatically gets height
                RelativeLayout.LayoutParams.WRAP_CONTENT                        // automatically gets width
        );

        RelativeLayout.LayoutParams usernameDetail = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,                       // automatically gets height
                RelativeLayout.LayoutParams.WRAP_CONTENT                        // automatically gets width
        );


        // Dip - Density Independent Pixels
        // Every single device will have the same width regardless of number of pixel
        // getResource() - get information of the app -- we need this information display/screen
        Resources r = getResources();

        // This method convert dip to px
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200,
                r.getDisplayMetrics());



        // How you want to position your content
        buttonDetail.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetail.addRule(RelativeLayout.CENTER_VERTICAL);

        usernameDetail.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetail.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetail.setMargins(0, 0, 0, 50);
        username.setWidth(px);




        // ******** ADDING TO SCREEN **********
        // Change button text and color
        redButton.setBackgroundColor(Color.RED);
        redButton.setText("Log In");

        // Adding the button to the layout (Embedding button in the layout)
        // ****relative_layout.addView(redButton);***
        relative_layout.addView(redButton, buttonDetail);
        relative_layout.addView(username, usernameDetail);



        // Setting relative_layout as home screen
        setContentView(relative_layout);
    }
}
