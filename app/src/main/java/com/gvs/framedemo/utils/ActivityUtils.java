package com.gvs.framedemo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * @author jane
 * @time 2016/10/25  13:04
 * @desc ${TODD}
 */
public class ActivityUtils {
    public static void startActivity(Context c, Class<? extends Activity> clazz, boolean isFinishSelf){
        Intent intent = new Intent(c,clazz);
        c.startActivity(intent);
        if(isFinishSelf) {
            ((Activity)c).finish();
        }

    }
}
