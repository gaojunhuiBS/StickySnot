package com.example.sovnem.stickysnot;

import android.util.Log;

/**
 * Created by sovnem on 16/6/19,11:08.
 */
public class L {

    private static final boolean isDebug = true;


    public static void i(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }

    public static void i(String msg) {
        if (isDebug) Log.i("zhjh", msg);
    }
}