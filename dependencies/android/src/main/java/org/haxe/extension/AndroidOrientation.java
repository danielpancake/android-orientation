package org.haxe.extension.androidorientation;

import android.content.pm.ActivityInfo;
import org.haxe.extension.Extension;

public class AndroidOrientation extends Extension {
    private static int fixedOrientation = 0;

    public static final int PORTRAIT = 1;
    public static final int REVERSE_PORTRAIT = 2;
    public static final int SENSOR_PORTRAIT = 3;
    public static final int LANDSCAPE = 4;
    public static final int REVERSE_LANDSCAPE = 5;
    public static final int SENSOR_LANDSCAPE = 6;

    public static void setRequestedOrientation(int screenOrientation) {
        int requestedOrientation;
        switch(screenOrientation) {
            case PORTRAIT: requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT; break;
            case REVERSE_PORTRAIT: requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT; break;
            case SENSOR_PORTRAIT: requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT; break;

            case LANDSCAPE: requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE; break;
            case REVERSE_LANDSCAPE: requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE; break;
            case SENSOR_LANDSCAPE: requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE; break;
            
            default: requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED;
        }
        
        Extension.mainActivity.setRequestedOrientation(requestedOrientation);
        fixedOrientation = requestedOrientation;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (fixedOrientation != 0) {
            Extension.mainActivity.setRequestedOrientation(fixedOrientation);
        }
    }
}