package com.android.mozio.docapp.viewModel;

import android.content.Context;

import com.android.mozio.docapp.model.PatientInfoModel;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by N I R M E S H on 2017-07-08.
 */

public class ViewPatientHistoryModel implements ViewModel {

    private Context mContext;
    private DataListener mDataListener;

    public ViewPatientHistoryModel(Context context, DataListener listener) {
        mDataListener = listener;
        mContext = context;
        loadPatientInfoFromDatabase();
    }

    /**
     * Load patient info from database
     */
    private void loadPatientInfoFromDatabase() {
        Realm realmDb = Realm.getDefaultInstance();
        RealmResults<PatientInfoModel> resultDbs = realmDb.where(PatientInfoModel.class).findAll();
        if (null != mDataListener) {
            mDataListener.onPatientHistoryLoad(resultDbs);
        }
    }

    @Override
    public void onDestroy() {
        mContext = null;
        mDataListener = null;
    }

    public interface DataListener {
        void onPatientHistoryLoad(RealmResults<PatientInfoModel> data);
    }
}
