package com.getapp.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoComplete;
    String[] names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a refer to the AutoComplete text view in the xml file
        autoComplete = (AutoCompleteTextView) findViewById(R.id.country);

        // get the list of countries(string array) in the resources > string.xml
        names = getResources().getStringArray(R.array.country_names);

        /*   We need ArrayAdapter to add the string values to the AutoCompleteTextView variable called autoComplete
            This ArrayAdapter element is of type string.
            ArrayAdapter is in the middle of an ArrayList(data source) and ListView(visual representation
            ArrayAdapter takes in two things into consideration:
            * which array to use a data source for the list
            * How to convert any given list item into corresponding ListView.

            ARRAYLIST(DATA SOURCE) <--------------> ARRAYADAPTER <------------> LISTVIEW(VISUAL REPRESENTATION)
        */
        //                                                      Context, Layout resource, data source
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                                                                names);

        autoComplete.setAdapter(adapter);

    }
}
