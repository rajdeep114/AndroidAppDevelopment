package com.getapp.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ThemedSpinnerAdapter;


public class MainActivity extends AppCompatActivity {
    Spinner spin;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = (Spinner) findViewById(R.id.spin);

        // Initialize adapter                                                   // This set layout for each item.
        adapter = ArrayAdapter.createFromResource(this, R.array.countryNames, android.R.layout.simple_spinner_item);

        // Specific layout of each drop down list adapter ---  Drop down view resource
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);

        // Method that handles events
        // *************** Need to review this code *********************
      spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(getBaseContext(),parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });

    }
}
