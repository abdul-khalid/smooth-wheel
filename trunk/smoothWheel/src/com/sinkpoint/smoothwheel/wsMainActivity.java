package com.sinkpoint.smoothwheel;

import android.app.Activity;
import android.os.Bundle;

public class wsMainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntWheelAdapter wadp = new IntWheelAdapter(0, 9, "00");
        setContentView(R.layout.main);
        
        WheelView wv = (WheelView) this.findViewById(R.id.wheel);
        wv.setAdapter(wadp);        
        
    }
}