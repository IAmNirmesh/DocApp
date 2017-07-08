package com.android.mozio.docapp.viewModel;

import android.content.Context;

import com.android.mozio.docapp.R;
import com.android.mozio.docapp.model.PatientInfoModel;

/**
 * Created by N I R M E S H on 2017-07-08.
 */

public class PatientHistoryItemViewModel implements ViewModel {

    private Context mContext;
    private PatientInfoModel patientInfoModel;

    public PatientHistoryItemViewModel(Context context, PatientInfoModel patientInfoModel) {
        mContext = context;
        this.patientInfoModel = patientInfoModel;
    }

    public String getPatientName() {
        return patientInfoModel.getPatientName();
    }

    public String getPatientPhoneNo() {
        return patientInfoModel.getPatientPhoneNumber();
    }

    public String getPatientAge() {
        return patientInfoModel.getPatientAge()+" yr";
    }

    public String isMigraine() {
        return patientInfoModel.isPatientSuffersMigraine() ? "Migraine: Yes" : "Migraine: No";
    }

    public String isHallucinogenicDrugs() {
        return patientInfoModel.isPatientUseHalluDrugs() ? "Hallucinogenic Drugs: Yes" : "Hallucinogenic Drugs: No";
    }

    public String isPatientMale() {
        return patientInfoModel.isPatientMale() ? "Male": "Female";
    }

    public String toddSyndrome() {
        String toddSyndrome = String.format(mContext.getString(
                R.string.todd_syndrome_item_txt),
                patientInfoModel.getToddSyndromeProbability());
        return toddSyndrome;
    }

    @Override
    public void onDestroy() {
        mContext = null;
        patientInfoModel = null;
    }
}
