package com.getapp.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    // Creating a text view
    TextView textView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This creates a reference to the textview defined in the xml class
        // R --> id ---> greeting_text_view
        // Since textView is an object, we have to type cast for the corresponding class.
        textView = (TextView) findViewById(R.id.greeting_text_view);

    }

    // Listner method is associated with an object called view. Whenever we click a button, a view
    // object is created. Therefore, we need it as a parameter to work with this view.
    public void buttonClicked(View view) {
//        String message = "Hey, you just clicked the button";
//
//        // set text to message whenever the button is clicked. onClick listner method calls this
//        // method when button is clicked. This is defined in the xml file.
//        textView.setText(message);

        String button_text;

        // When any of the two button(2nd or 3rd activity) is clicked, we need to refer to the view object,
        // which is created when any button is click. We need to find out which button is clicked by refer to
        // its text. This text can be found in the view object.

        // This line of code gets the text of the button stored in the view object and convert it in a string
        button_text = ((Button) view).getText().toString();


        // Intent object is required to start a new activity, since they are responsible for invoking a new activity
        if(button_text.equals("Open Second Activity")) {
            // this keyword is used because intent is the subclass of content class. First parameter is the content object
            // Since the object is intent itself, we use this keyword
            Intent intent = new Intent(this, SecondActivity.class);
            // This will start the activity
            startActivity(intent);
        } else if (button_text.equals("Open Third Activity")) {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
    }
}
