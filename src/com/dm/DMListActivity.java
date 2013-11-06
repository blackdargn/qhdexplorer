package com.dm;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import cn.domob.android.ads.DomobAdView;

import com.hd.explorer.R;

public class DMListActivity extends ListActivity {
    
    private DomobAdView adView1;
    private DomobAdView adView2;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN , WindowManager.LayoutParams. FLAG_FULLSCREEN);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        adView1.requestRefreshAd();
        adView2.requestRefreshAd();
    }
        
    @Override
    public void setContentView(int layoutResID)
    {
        ViewGroup template = (ViewGroup)LayoutInflater.from(this).inflate(R.layout.activity_template, null);
        
        LinearLayout topBarLay = (LinearLayout)template.findViewById(R.id.topBarLay);
        LinearLayout btmBarLay = (LinearLayout)template.findViewById(R.id.btmBarLay);
        LinearLayout containerLay = (LinearLayout)template.findViewById(R.id.containerLay);
        
        View view = getLayoutInflater().inflate(layoutResID, null);     
        containerLay.addView(view,new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
    
        adView1 = DMUtil.bindView(this, topBarLay, DMUtil.FlexibleInlinePPID1);
        adView2 = DMUtil.bindView(this, btmBarLay, DMUtil.FlexibleInlinePPID2);
        
        setContentView(template);
        getListView().addFooterView(DMUtil.createAdView(this, DMUtil.FlexibleInlinePPID2));
    }
}