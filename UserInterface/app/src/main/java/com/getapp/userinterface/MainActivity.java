package com.getapp.userinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText messageText;
    public final static String MESSAGE_KEY = "uniqueKey_message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void messageSend(View view) {
        messageText = (EditText) findViewById(R.id.messageText);

        // Get message from the edit text
        String message = messageText.getText().toString();

        // Create a new intent object to invoke a new activity
        Intent intent = new Intent(this, SecondActivity.class);

        // Now we need to attach data into the intent object. We do that by calling a putExtras method.
        // The putExtra method uses a key/value pair as a parameter.
                        // KEY         value/data
        intent.putExtra(MESSAGE_KEY, message);
        startActivity(intent);


    }
}
