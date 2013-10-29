package com.dm;

import android.preference.PreferenceActivity;
import android.view.ViewGroup;

public class DMPrefenceActivity extends PreferenceActivity {
    @Override
    public void addPreferencesFromResource(int preferencesResId) {
        super.addPreferencesFromResource(preferencesResId);
        DMUtil.bindView(this, (ViewGroup)getListView().getRootView(), DMUtil.FlexibleInlinePPID1);
        getListView().addFooterView(DMUtil.createAdView(this, DMUtil.FlexibleInlinePPID2));
    }
}