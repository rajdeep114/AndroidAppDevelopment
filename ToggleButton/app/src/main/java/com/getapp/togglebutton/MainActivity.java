package com.getapp.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Switch sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.result);
        text.setVisibility(View.INVISIBLE);         // Hides the textview
        sw = (Switch)findViewById(R.id.toggle_button_2);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    text.setText("Wifi On");
                    text.setVisibility(View.VISIBLE);
                } else {
                    text.setText("Wifi Off");
                    text.setVisibility(View.VISIBLE);
                }

            }
        });
    }

    public void changeVibrateState(View view) {
        boolean checked = ((ToggleButton) view).isChecked();
        if(checked) {
            text.setText("Vibrate On");
            text.setVisibility(View.VISIBLE);
        } else {
            text.setText("Vibrate Off");
            text.setVisibility(View.VISIBLE);
        }
    }
}
