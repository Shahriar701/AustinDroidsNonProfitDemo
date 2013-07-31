package com.austindroids.npa.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class RobotoTypeface {
    
    static Typeface regular = null;
    static Typeface cond = null;
    static Typeface bold = null;
    static Typeface boldCond = null;
    static Typeface black = null;

    public static void setRegularTypeface(Context c, TextView view) {
        if (regular == null) {
            initAssets(c);
        }
        view.setTypeface(regular);
    }
    
    public static void setCondensedTypeface(Context c, TextView view) {
        if (cond == null) {
            initAssets(c);
        }
        view.setTypeface(cond);
    }

    public static void setBoldTypeface(Context c, TextView view) {
        if (bold == null) {
            initAssets(c);
        }
        view.setTypeface(bold);
    }    
    
    public static void setBlackTypeface(Context c, TextView view) {
        if (black == null) {
            initAssets(c);
        }
        view.setTypeface(black);
    } 

    public static void setCondensedBoldTypeface(Context c, TextView view) {
        if (boldCond == null) {
            initAssets(c);
        }
        view.setTypeface(boldCond);
    }
    
    public static void initAssets(Context c) {
        boldCond = Typeface.createFromAsset(c.getAssets(), "fonts/Roboto/Roboto-BoldCondensed.ttf");
        bold = Typeface.createFromAsset(c.getAssets(), "fonts/Roboto/Roboto-Bold.ttf");
        black = Typeface.createFromAsset(c.getAssets(), "fonts/Roboto/Roboto-Black.ttf");
        cond = Typeface.createFromAsset(c.getAssets(), "fonts/Roboto/Roboto-Condensed.ttf");
        regular = Typeface.createFromAsset(c.getAssets(), "fonts/Roboto/Roboto-Regular.ttf");
    }
}
