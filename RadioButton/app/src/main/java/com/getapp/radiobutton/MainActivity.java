package com.getapp.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView finalResult;
    String itemSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finalResult = (TextView) findViewById(R.id.result);

    }

    public void selectFruit(View view) {
        boolean selected = ((RadioButton) view).isChecked();

           switch(view.getId()) {
               case R.id.apple:
                    if(selected)
                        finalResult.setText("Apple");
                    else
                        finalResult.setText("");
                break;

               case R.id.orange:
                    if(selected)
                        finalResult.setText("Orange");
                    else
                        finalResult.setText("");
               break;

               case R.id.banana:
                    if(selected)
                        finalResult.setText("Banana");
                    else
                        finalResult.setText("");
               break;
        }
    }
}
