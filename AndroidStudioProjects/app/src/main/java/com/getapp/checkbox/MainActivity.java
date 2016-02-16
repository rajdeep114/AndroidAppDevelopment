package com.getapp.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView result;
    ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.finalResult);
        result.setEnabled(false);
    }

    // Click event -- When done button is clicked, the finalized list is displayed.
    public void finalSelection(View view) {

        // Initialize an empty list, if nothing is selected.
        String final_fruit_selection = "";

//        for(String s: list)
//            final_fruit_selection += s + "\n";

        // Traverse through the list to display all selected items
        for(int i = 0; i < list.size() - 1; i++)
            final_fruit_selection  += list.get(i) + ", ";

        final_fruit_selection += list.get(list.size() - 1);

        result.setText(final_fruit_selection);
        result.setEnabled(true);
    }

    /* This method is used to see which items are selected and then update the ArrayList accordingly.
       In the first part, there is a boolean introduced to find out if the box is checked or not. This
       is done by referring to the view object passed to the method as parameter.

       Later, we use view.getId() method to see which check box is checked. We use this to make a switch/case statement

       switch/case -- it solves the purpose of nested case statements.

       If the box is checked -- add the fruit to the ArrayList, else remove it
   */

    public void selectItem(View view) {
        boolean checked;
        checked = ((CheckBox) view).isChecked();
        int id = view.getId();
        switch(id) {
            case R.id.apples:
                if (checked)
                    list.add("Apples");
                else
                    list.remove("Apples");
                break;

            case R.id.oranges:
                if (checked)
                    list.add("Oranges");
                else
                    list.remove("Oranges");
                break;

            case R.id.pineapples:
                if (checked)
                    list.add("Pineapples");
                else
                    list.remove("Pineapples");
                break;
            case R.id.grapes:
                if (checked)
                    list.add("Grapes");
                else
                    list.remove("Grapes");
                break;

            case R.id.bananas:
                if (checked)
                    list.add("Bananas");
                else
                    list.remove("Bananas");
                break;
        }
    }
}
