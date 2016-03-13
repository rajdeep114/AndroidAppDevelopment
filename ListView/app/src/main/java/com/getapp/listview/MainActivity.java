package com.getapp.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    TextView text;
    ArrayAdapter<String> adapter;
    String[] names = {"Rajdeep", "Aman", "Vikram", "Raman", "Manjit", "Ranjit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.text);
        list = (ListView)findViewById(R.id.list);
                                                // Default layout available in adroid
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        list.setAdapter(adapter);


        // Whenever the item is click -- Run this method
        // In order to access the item from the list, we use AdapaterView(?) parent and postion

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                text.setText("" + parent.getItemAtPosition(position));
            }
        });


    }
}
