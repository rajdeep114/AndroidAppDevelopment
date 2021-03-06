package com.getapp.smartcarwash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView finalResult;
    String itemSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
       finalResult = (TextView) findViewById(R.id.result);
    }

    public void next_Button(View view) {
        Intent intent = new Intent(this, Third_Activity.class);
        startActivity(intent);
    }

    public void back_Button(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void selectCarWash(View view) {
        boolean selected = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.smart:
                if(selected)
                    finalResult.setText("Smart Car Wash it is!");
                else
                    finalResult.setText("");
                break;

            case R.id.regular:
                if(selected)
                    finalResult.setText("You have selected regular car wash");
                else
                    finalResult.setText("");
                break;

        }
    }
}
