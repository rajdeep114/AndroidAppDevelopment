
****************************************** WORKING WITH BUTTON AND TEXT VIEW ************************************************************
*****************************************************************************************************************************************

public class MainActivity extends AppCompatActivity {

    // Creating a text view
    TextView textView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This creates a reference to the textview defined in the xml class
        // R --> id ---> greeting_text_view
        // Since textView is an object, we have to type cast for the corresponding class.
        textView = (TextView) findViewById(R.id.greeting_text_view);

    }

    // Listner method is associated with an object called view. Whenever we click a button, a view
    // object is created. Therefore, we need it as a parameter to work with this view.
    public void buttonClicked(View view) {
        String message = "Hey, you just clicked the button";

        // set text to message string whenever the button is clicked. onClick listner method calls this
        // method when button is clicked. This is defined in the xml file.v
        textView.setText(message);
    }
}
*****************************************************************************************************************************************
*****************************************************************************************************************************************



********************************************************* MULTIPLE ACTIVITY ************************************************************
****************************************************************************************************************************************
In order to make multiply activities, we need to create corresponding java and xml file. For java file, in an already existing project, go to 
app > java > project name(user defined) > right click and create a New java class. For xml file, go to app > res > layout > right click on 
layout and choose layout resource file.
------------------------------------------------------------------------------------------------------------------------------------------
Later, you have to register the newly created activities(java and xml files) in manifest > AndroidManifest.xml

THis is AndroidManifest file 

	<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.getapp.firstapp">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    %%%    <activity android:name=".SecondActivity"></activity>
    %%%    <activity android:name=".ThirdActivity"></activity>
    </application>

</manifest>

% - newly added activities.
------------------------------------------------------------------------------------------------------------------------------------------
Java file of second activity


// overide on create method. Connect corresponding java and xml file
public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);
    }
}

------------------------------------------------------------------------------------------------------------------------------------------
Java file of third activity

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
    }
}



------------------------------------------------------------------------------------------------------------------------------------------
File to move between activity -- this is the main java file of the program


    public void buttonClicked(View view) {
//        String message = "Hey, you just clicked the button";
//
//        // set text to message whenever the button is clicked. onClick listner method calls this
//        // method when button is clicked. This is defined in the xml file.
//        textView.setText(message);

        String button_text;

        // When any of the two button(2nd or 3rd activity) is clicked, we need to refer to the view object,
        // which is created when any button is click. We need to find out which button is clicked by refer to
        // its text. This text can be found in the view object.

        // This line of code gets the text of the button stored in the view object and convert it in a string
        button_text = ((Button) view).getText().toString();


        // Intent object is required to start a new activity, since they are responsible for invoking a new activity
        if(button_text.equals("Open Second Activity")) {
            // this keyword is used because intent is the subclass of content class. First parameter is the content object
            // Since the object is intent itself, we use this keyword
            Intent intent = new Intent(this, SecondActivity.class);
            // This will start the activity
            startActivity(intent);
        } else if (button_text.equals("Open Third Activity")) {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
    }


****************************************************************************************************************************************
****************************************************************************************************************************************

********************************************************* USER INTERFACE ***************************************************************
****************************************************************************************************************************************
We can align the component horizontal or vertically using the linear layout.
Refer to xml tutorial

****************************************************************************************************************************************
****************************************************************************************************************************************

********************************************************* SEND MESSAGE BETWEEN ACTIVITIES **********************************************
****************************************************************************************************************************************

public class MainActivity extends AppCompatActivity {
    EditText messageText;
    public final static String MESSAGE_KEY = "uniqueKey_message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void messageSend(View view) {
        messageText = (EditText) findViewById(R.id.messageText);

        // Get message from the edit text
        String message = messageText.getText().toString();

        // Create a new intent object to invoke a new activity
        Intent intent = new Intent(this, SecondActivity.class);

        // Now we need to attach data into the intent object. We do that by calling a putExtras method.
        // The putExtra method uses a key/value pair as a parameter.
                        // KEY         value/data
        intent.putExtra(MESSAGE_KEY, message);
        startActivity(intent);


    }
}

------------------------------------------------------------------------------------------------------------------------------------------

    public final static String MESSAGE_KEY = "uniqueKey_message_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This returns the intent that started this activity
        // Later, we can you intent.getExtra("somekey") to get data in the new activity
        // **************************************************************
        // For example:
        // Return the intent that started this activity.

        //    If you start an Activity with some data, for example by doing
            Intent intent = new Intent(context, SomeActivity.class);
            intent.putExtra("someKey", someData);

        //    You can retrieve this data using getIntent in the new activity:
            Intent intent = getIntent();
            String str = intent.getExtra("someKey");

     // **************************************************************

        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        TextView text = new TextView(this);
        text.setTextSize(200);
        text.setText(message);
        setContentView(text);
    }
}



****************************************************************************************************************************************
****************************************************************************************************************************************



********************************************************* LINEAR LAYOUT  ***************************************************************
****************************************************************************************************************************************

Refer to the xml file

****************************************************************************************************************************************
****************************************************************************************************************************************



********************************************************* RELATIVE LAYOUT  *************************************************************
****************************************************************************************************************************************

Refer to the xml file

****************************************************************************************************************************************
****************************************************************************************************************************************


********************************************************* BUTTONS **********************************************************************
****************************************************************************************************************************************

Refer to the xml file

****************************************************************************************************************************************
****************************************************************************************************************************************


**************************************************** BUTTON CLICK EVENTS ***************************************************************
****************************************************************************************************************************************

public class MainActivity extends AppCompatActivity {
    TextView message;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (TextView) findViewById(R.id.text);
        
        // Another way of writing a on click listner
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View view) {
                 Toast.makeText(getBaseContext(), "You clicked second button", Toast.LENGTH_SHORT).show();
             }
        });
    }

    // On click methods are always public and their return type is void
    public void buttonClicked(View view) {
        // Toast is a kind of a pop you see when the user performs an action.

        //                                  Text to be displayed        Duration        show/hide
        Toast.makeText(getBaseContext(), "You clicked first button", Toast.LENGTH_SHORT).show();
    }
}


****************************************************************************************************************************************
****************************************************************************************************************************************


********************************************************* KEYBOARD TYPES ***************************************************************
****************************************************************************************************************************************

REFER TO XML FILE

****************************************************************************************************************************************
****************************************************************************************************************************************


************************************************* AUTO COMPLETE TEXTVIEW ***************************************************************
****************************************************************************************************************************************
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
        //                                                      Context, 		Layout resource, 		data source
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        autoComplete.setAdapter(adapter);

    }
}


****************************************************************************************************************************************
****************************************************************************************************************************************

********************************************************* RADIOBUTTON ******************************************************************
****************************************************************************************************************************************


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


****************************************************************************************************************************************
****************************************************************************************************************************************

********************************************************** CHECKBOXES ******************************************************************
****************************************************************************************************************************************

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


****************************************************************************************************************************************
****************************************************************************************************************************************


********************************************************** TOGGLEBUTTON ****************************************************************
****************************************************************************************************************************************
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

****************************************************************************************************************************************
****************************************************************************************************************************************



********************************************************** SPINNER *********************************************************************
****************************************************************************************************************************************
------ NEED TO REVIEW THIS VIDEO ---------

public class MainActivity extends AppCompatActivity {
    Spinner spin;
    ArrayAdapter<CharSequence> adapter;

   
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

****************************************************************************************************************************************
****************************************************************************************************************************************