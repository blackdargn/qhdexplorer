package com.dm;

import android.app.ListActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import cn.domob.android.ads.DomobAdView;

import com.hd.explorer.R;

public class DMListActivity extends ListActivity {
    
    private DomobAdView adView1;
    private DomobAdView adView2;
   
    
    @Override
    protected void onResume() {
        super.onResume();
        DMUtil.requestRefresh(adView1);
        DMUtil.requestRefresh(adView2);
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
        MLinelayout line = new MLinelayout(this);
        line.addView(DMUtil.createAdView(this, DMUtil.FlexibleInlinePPID2));
        getListView().addFooterView(line);
    }
}