package com.example.nero.tourguideap;

import android.app.ListFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListViewFragment.OnFragmentInteractionListener, DisplayDataFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onFragmentInteraction(int id) {
        FragmentManager frgmana = getSupportFragmentManager();
        DisplayDataFragment fragment = (DisplayDataFragment) getFragmentManager().findFragmentById(R.id.dataDisplayFragment);
        fragment.updateData(id);
    }
}
