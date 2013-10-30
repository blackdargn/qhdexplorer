package com.dm;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import cn.domob.android.ads.DomobAdView;

import com.hd.explorer.R;

public class DMActivity extends Activity {
    
    private DomobAdView adView1;
    private DomobAdView adView2;

    @Override
    protected void onResume() {
        super.onResume();
        adView1.requestRefreshAd();
        adView2.requestRefreshAd();
    }
    
    @Override
    public void setContentView(int layoutResID)
    {
        super.setContentView(R.layout.activity_template);
        LinearLayout topBarLay = (LinearLayout)findViewById(R.id.topBarLay);
        LinearLayout btmBarLay = (LinearLayout)findViewById(R.id.btmBarLay);
        LinearLayout containerLay = (LinearLayout)findViewById(R.id.containerLay);
        
        View view = getLayoutInflater().inflate(layoutResID, null);     
        containerLay.addView(view,new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
    
        adView1 = DMUtil.bindView(this, topBarLay, DMUtil.FlexibleInlinePPID1);
        adView2 = DMUtil.bindView(this, btmBarLay, DMUtil.FlexibleInlinePPID2);
    }
}