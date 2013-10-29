package com.dm;

import android.app.ListActivity;
import android.view.ViewGroup;
import cn.domob.android.ads.DomobAdView;

public class DMListActivity extends ListActivity {
    
    private DomobAdView adView;
    
    @Override
    protected void onResume() {
        super.onResume();
        adView.requestRefreshAd();
    }
        
    @Override
    public void setContentView(int layoutResID)
    {
        super.setContentView(layoutResID);      
        adView = DMUtil.bindView(this, (ViewGroup)getListView().getRootView(), DMUtil.FlexibleInlinePPID1);
    }
}