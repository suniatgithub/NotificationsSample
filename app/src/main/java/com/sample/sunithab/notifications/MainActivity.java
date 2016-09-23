package com.sample.sunithab.notifications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    NotificationManager mNotificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNotificationManager = new NotificationManager();

        handleNotification();
    }

    public void onSingleNotificationButtonClicked(View view) {
        mNotificationManager.showSingleNotification(this);
        finish();
    }

    public void onBundledNotificationsButtonClicked(View view) {
        mNotificationManager.showBundledNotifications(this);
        finish();
    }

    public void onDirectReplyNotificationButtonClicked(View view) {
        mNotificationManager.showNotificationWithReplyOption(this);
        finish();
    }

    private void handleNotification() {
        Intent intent = getIntent();
        if (intent != null) {
            String message = mNotificationManager.handleNotification(intent, this);

            if (!TextUtils.isEmpty(message)) {
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
