package com.android.mozio.docapp.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.mozio.docapp.R;
import com.android.mozio.docapp.view.fragments.AddPatientInfoFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add patient info fragment
        getSupportFragmentManager().beginTransaction().
                replace(R.id.container, AddPatientInfoFragment.getInstance(), AddPatientInfoFragment.TAG).commit();
    }
}
