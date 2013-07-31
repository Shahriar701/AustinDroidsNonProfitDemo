
package com.austindroids.npa.app;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NonProfitApp extends Application {

    private static Context mContext;
    public static NonProfitApp defaultInstance;

    @Override
    public void onCreate() {
        NonProfitApp.mContext = getApplicationContext();
        NonProfitApp.defaultInstance = this;
        initialize();
    }

    public static NonProfitApp getInstance() {
        return NonProfitApp.defaultInstance;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    // Context for routines not explicitly in an Activity.
    public static Context getAppContext() {
        return mContext;
    }

    public static boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) NonProfitApp.mContext
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    private void initialize() {
    }
}
