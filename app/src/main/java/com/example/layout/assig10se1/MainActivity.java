package com.example.layout.assig10se1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//here i have created main class
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//extends is for extending a class. implements is for implementing an interface
//AppCompatActivity is a parent class
    EditText editText;
    //Edittext:A user interface element for entering and modifying text and creating the edit text object
    Button button;
    //Button:A button consists of text or an icon (or both text and an icon) that communicates what action occurs when the user touches it. ...
    BlankFragment fragment;
    //A fragment is usually used as part of an activity's user interface and contributes its own layout to the activity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses
        // in other package or any class within the package of the protected members class.
        //void is a Java keyword.  Used at method declaration and definition to specify that the method does not return any type,
        // the method returns void.
        //onCreate Called when the activity is first created. This is where you should do all of your normal static set up: create views,
        // bind data to lists, etc. This method also provides you with a Bundle containing the activity's previously frozen state,
        // if there was one.Always followed by onStart().
        //Bundle is most often used for passing data through various Activities.
// This callback is called only when there is a saved instance previously saved using onSaveInstanceState().
// We restore some state in onCreate() while we can optionally restore other state here, possibly usable after onStart() has
// completed.The savedInstanceState Bundle is same as the one used in onCreate().

        super.onCreate(savedInstanceState);
// call the super class onCreate to complete the creation of activity like the view hierarchy
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //  main is the xml you have created under res->layout->main.xml
        //  Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        // The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        // the design
        editText = findViewById(R.id.editText);
        //creating edit text objects
        button = findViewById(R.id.button);
        fragment = new BlankFragment();
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        //begins the transaction
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        //A layout defines the visual structure for a user interface, such as the UI for an activity or app widget.
        transaction.add(R.id.frameLayout,fragment);
        //adds the transaction layout
        transaction.commit();
        //commits the transaction
        //button onclicklistener will help us to work as once the button clicked it will opens the respective layout
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //Called when a view has been clicked.
            public void onClick(View view) {
                fragment.data(editText.getText().toString());
            //getText:Return the text that TextView is displaying.
                //toString:Returns a string representation of the object
            }
        });
    }
    //here we send the data to the fragment
    public interface sendData{
        void data(String data);
    }
}