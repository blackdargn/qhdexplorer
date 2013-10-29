package com.dm;

import cn.domob.android.ads.DomobAdView;
import android.preference.PreferenceActivity;
import android.view.ViewGroup;

public class DMPrefenceActivity extends PreferenceActivity {
    
    private DomobAdView adView;
    
    @Override
    protected void onResume() {
        super.onResume();
        adView.requestRefreshAd();
    }
    
    @Override
    public void addPreferencesFromResource(int preferencesResId) {
        super.addPreferencesFromResource(preferencesResId);
        
        adView = DMUtil.bindView(this, (ViewGroup)getListView().getRootView(), DMUtil.FlexibleInlinePPID1);
    }   
}