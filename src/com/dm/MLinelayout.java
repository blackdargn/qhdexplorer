/**
 * FileMgrExplorer
 * MLinelayout.java
 * com.dm
 * 
 */
package com.dm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/*********************************************************
 * @author : zhaohua
 * @version : 2013-11-14
 * @see : 
 * @Copyright : copyrights reserved by personal 2007-2012
 **********************************************************/
public class MLinelayout extends LinearLayout
{
    public MLinelayout(Context context)
    {
        super(context);
    }

    public MLinelayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev)
    {
        if(DMUtil.BUFFED) {
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }
    
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev)
    {
        if(DMUtil.BUFFED) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }
}