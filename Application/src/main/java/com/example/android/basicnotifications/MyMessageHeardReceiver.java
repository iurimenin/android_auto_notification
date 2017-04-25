package com.example.android.basicnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyMessageHeardReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        int thisConversationId = intent.getIntExtra("conversation_id", -1);

        Log.d("MyMessageHeardReceiver", "MyMessageHeardReceiver for conversation id " + thisConversationId);
    }
}
