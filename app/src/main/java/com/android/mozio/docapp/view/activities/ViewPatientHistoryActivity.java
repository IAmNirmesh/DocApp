package com.android.mozio.docapp.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.android.mozio.docapp.R;
import com.android.mozio.docapp.view.fragments.ViewPatientFragment;

public class ViewPatientHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_patient_history);

        //Set back navigation
        if(null != getSupportActionBar())
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Add patient history list fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.container, ViewPatientFragment.getInstance()
                , ViewPatientFragment.TAG).commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Finish activity when back button clicked
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
