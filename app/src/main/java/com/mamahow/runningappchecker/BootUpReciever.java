package com.mamahow.runningappchecker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by tiggly on 6/29/15.
 */

public class BootUpReciever extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent ㄑintent) {
        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}