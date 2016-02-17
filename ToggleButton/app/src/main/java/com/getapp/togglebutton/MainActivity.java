package com.getapp.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.result);
        text.setVisibility(View.INVISIBLE);         // Hides the textview
    }

    public void changeVibrateState(View view) {
        boolean checked = ((ToggleButton) view).isChecked();
        if(checked) {
            text.setText("VibrateOn");
            text.setVisibility(View.VISIBLE);
        } else {
            text.setText("VibrateOff");
            text.setVisibility(View.INVISIBLE);
        }
    }
}
