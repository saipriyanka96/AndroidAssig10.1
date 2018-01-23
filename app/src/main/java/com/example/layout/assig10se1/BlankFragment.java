package com.example.layout.assig10se1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 23-01-2018.
 */

public class BlankFragment extends Fragment implements MainActivity.sendData {


    TextView textView;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank, container, false);

        textView = (TextView)view.findViewById(R.id.tv);


        return view;
    }

    @Override
    //Called immediately after onCreateView(LayoutInflater, ViewGroup, Bundle) has returned, but before any saved state has been restored in to the view.
    //view	View: The View returned by onCreateView(LayoutInflater, ViewGroup, Bundle).
    //savedInstanceState	Bundle: If non-null, this fragment is being re-constructed from a previous saved state as given here.

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
       public void data(String data) {
        textView.setText(data);
       // Sets the text to be displayed using a string resource identifier.
    }
}