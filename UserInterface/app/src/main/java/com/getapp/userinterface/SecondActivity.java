package com.getapp.userinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public final static String MESSAGE_KEY = "uniqueKey_message_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This returns the intent that started this activity
        // Later, we can you intent.getExtra("somekey") to get data in the new activity
        // **************************************************************
        // For example:
        /*  Return the intent that started this activity.

        //    If you start an Activity with some data, for example by doing
            Intent intent = new Intent(context, SomeActivity.class);
            intent.putExtra("someKey", someData);

        //    You can retrieve this data using getIntent in the new activity:
            Intent intent = getIntent();
            String str = intent.getExtra("someKey");

     // **************************************************************
*/
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        TextView text = new TextView(this);
        text.setTextSize(200);
        text.setText(message);
        setContentView(text);
    }
}
