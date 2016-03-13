package com.getapp.smartcarwash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {
    TextView finalResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        finalResult = (TextView) findViewById(R.id.result);
    }

    public void next_Button(View view) {
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }

    public void back_Button(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
    public void selectCredit(View view) {
        boolean selected = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.credit:
                if(selected)
                    finalResult.setText("Please have credit card handy");
                else
                    finalResult.setText("");
                break;

            case R.id.PayPal:
                if(selected)
                    finalResult.setText("Please have your paypal account info ready!");
                else
                    finalResult.setText("");
                break;

            case R.id.GiftCard:
                if(selected)
                    finalResult.setText("Please have your gift card account number ready!");
                else
                    finalResult.setText("");
                break;

        }
    }
}
