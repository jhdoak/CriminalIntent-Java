package com.bignerdranch.android.criminalintentjava;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            createCrimeFragment(fm, fragment);
        }
    }

    private void createCrimeFragment(FragmentManager fm, Fragment fragment) {
        fragment = new CrimeFragment();
        fm.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();
    }
}
