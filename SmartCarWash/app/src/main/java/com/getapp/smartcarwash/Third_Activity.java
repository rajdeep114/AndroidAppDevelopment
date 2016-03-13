package com.getapp.smartcarwash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Third_Activity extends AppCompatActivity {

    Spinner spin1;
    Spinner spin2;
    Spinner spin3;
    Spinner spin4;
    ArrayAdapter<CharSequence> adapter1;
    ArrayAdapter<CharSequence> adapter2;
    ArrayAdapter<CharSequence> adapter3;
    ArrayAdapter<CharSequence> adapter4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);

        spin1 = (Spinner) findViewById(R.id.spin1);
        spin2 = (Spinner) findViewById(R.id.spin2);
        spin3 = (Spinner) findViewById(R.id.spin3);
        spin4 = (Spinner) findViewById(R.id.spin4);

        adapter1 = ArrayAdapter.createFromResource(this, R.array.styleNames, android.R.layout.simple_spinner_item);
        adapter2 = ArrayAdapter.createFromResource(this, R.array.yearNames, android.R.layout.simple_spinner_item);
        adapter3 = ArrayAdapter.createFromResource(this, R.array.makeNames, android.R.layout.simple_spinner_item);
        adapter4 = ArrayAdapter.createFromResource(this, R.array.modelNames, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin1.setAdapter(adapter1);
        spin2.setAdapter(adapter2);
        spin3.setAdapter(adapter3);
        spin4.setAdapter(adapter4);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void next_Button(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void back_Button(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}


//
//Spinner spin;
//ArrayAdapter<CharSequence> adapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        spin = (Spinner) findViewById(R.id.spin);
//
//        // Initialize adapter                                                   // This set layout for each item.
//        adapter = ArrayAdapter.createFromResource(this, R.array.countryNames, android.R.layout.simple_spinner_item);
//
//        // Specific layout of each drop down list adapter ---  Drop down view resource
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        spin.setAdapter(adapter);
//
//        // Method that handles events
//        // *************** Need to review this code *********************
//        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//    }
//}