package com.example.android.basicnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.RemoteInput;
import android.util.Log;

public class MyMessageReplyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        int thisConversationId = intent.getIntExtra("conversation_id", -1);

        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null) {
            CharSequence replyText = remoteInput.getCharSequence("voice_reply_key");
            Log.d("MyMessageReplyReceiver", "Found voice reply [" + replyText + "]");
        }
    }
}
