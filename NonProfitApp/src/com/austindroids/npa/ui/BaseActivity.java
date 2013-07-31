package com.austindroids.npa.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.mowaa.mealsonwheels.R;

public class BaseActivity extends Activity {

    protected Context mContext = null;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base);
    }

}
