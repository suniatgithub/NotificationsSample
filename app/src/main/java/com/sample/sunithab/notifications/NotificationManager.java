package com.sample.sunithab.notifications;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.RemoteInput;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.RemoteViews;


public class NotificationManager {

    public static final int REPLY_INTENT_ID = 0;
    public static final int DELETE_INTENT_ID = 1;
    public static final int SIMPLE_INTENT_ID = 2;
    public static final int SUMMARY_INTENT_ID = 3;
    public static final int BUNDLED_INTENT1_ID = 4;

    public static final int SIMPLE_NOTIFICATION_ID = 1244;
    public static final int REMOTE_NOTIFICATION_ID = 1245;

    public static final int BUNDLED_NOTIFICATION_SUMMARY_ID = 1246;
    public static final int BUNDLED_NOTIFICATION_1_ID = 1247;
    public static final int BUNDLED_NOTIFICATION_2_ID = 1248;

    public static final int NON_BUNDLED_NOTIFICATION_ID = 1249;

    public static final String LABEL_REPLY = "Reply";
    public static final String LABEL_DELETE = "Delete";

    public static final String SIMPLE_NOTIFICATION_ACTION = "com.sample.sunithab.notifications.SIMPLE_NOTIFICATION_ACTION";
    public static final String REPLY_ACTION = "com.sample.sunithab.notifications.ACTION_MESSAGE_REPLY";
    public static final String DELETE_ACTION = "com.sample.sunithab.notifications.ACTION_MESSAGE_DELETE";
    public static final String SUMMARY_ACTION = "com.sample.sunithab.notifications.SUMMARY_NOTIFICATION";

    public static final String KEY_PRESSED_ACTION = "KEY_PRESSED_ACTION";
    public static final String KEY_TEXT_REPLY = "KEY_TEXT_REPLY";
    private static final String KEY_NOTIFICATION_GROUP = "KEY_NOTIFICATION_GROUP";

    private static final String NOTIFICATION_ID = "Notification_id_key";


    public void showSingleNotification(Context context) {
        NotificationCompat.Builder notification = createNotificationBuilder(context,
                "Simple Notification", "Here is a simple notification!");

        Intent launchIntent = new Intent(context, MainActivity.class);
        launchIntent.setAction(SIMPLE_NOTIFICATION_ACTION);

        PendingIntent pendingIntent = PendingIntent.getActivity(context, SIMPLE_INTENT_ID, launchIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);

        notification.setContentIntent(pendingIntent);

        showNotification(context, notification.build(), SIMPLE_NOTIFICATION_ID);
    }


    public NotificationCompat.Builder createNotificationBuilder(Context context,
                                                                String title, String message) {
        Bitmap largeIcon = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.smiley);

        return new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.ic_notification_1)
                .setContentTitle(title)
                .setContentText(message)
                .setLargeIcon(largeIcon)
                .setColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .setAutoCancel(true);
    }

    private void showNotification(Context context, Notification notification, int id) {
        android.app.NotificationManager notificationManager =
                (android.app.NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(id, notification);
    }

    public void showNotificationWithReplyOption(Context context) {
        int notificationId = REMOTE_NOTIFICATION_ID;

        // reply action
        // create remote input
//        RemoteInput remoteInput = new RemoteInput.Builder(KEY_TEXT_REPLY)
//                .setLabel(LABEL_REPLY)
//                .build();

        // create intent for reply action
//        PendingIntent replyIntent = PendingIntent.getActivity(context,
//                REPLY_INTENT_ID,
//                getActionIntent(context, notificationId, REPLY_ACTION),
//                PendingIntent.FLAG_UPDATE_CURRENT);

        // create reply action
//        NotificationCompat.Action replyAction =
//                new NotificationCompat.Action.Builder(R.drawable.icon_action_reply,
//                        LABEL_REPLY, replyIntent)
//                        .addRemoteInput(remoteInput)
//                        .build();

        // create delete intent
//        PendingIntent archiveIntent = PendingIntent.getActivity(context,
//                DELETE_INTENT_ID,
//                getActionIntent(context, notificationId, DELETE_ACTION),
//                PendingIntent.FLAG_UPDATE_CURRENT);

        // create delete action
//        NotificationCompat.Action archiveAction =
//                new NotificationCompat.Action.Builder(R.drawable.icon_action_trash,
//                        LABEL_DELETE, archiveIntent)
//                        .build();

        // create notification builder
//        NotificationCompat.Builder builder =
//                createNotificationBuilder(context, "John Snow", "How is it going?");

        // add actions
//        builder.addAction(replyAction);
//        builder.addAction(archiveAction);

        // display notification
//        showNotification(context, builder.build(), notificationId);
    }


    public void showBundledNotifications(Context context) {
        // first notification

//        NotificationCompat.Builder notification1 = createNotificationBuilder(
//                context, "Notification 1", "Here's first notification!");
//        notification1.setGroup(KEY_NOTIFICATION_GROUP);
//
//        Intent launchIntent = new Intent(context, MainActivity.class);
//        launchIntent.setAction(SUMMARY_ACTION);
//        launchIntent.putExtra(NOTIFICATION_ID, BUNDLED_NOTIFICATION_1_ID);
//
//        PendingIntent pendingIntent1 = PendingIntent.getActivity(context, BUNDLED_INTENT1_ID, launchIntent,
//                PendingIntent.FLAG_UPDATE_CURRENT);
//        notification1.setContentIntent(pendingIntent1);


        // second notification with actions
//        PendingIntent replyIntent = PendingIntent.getActivity(context,
//                REPLY_INTENT_ID,
//                getActionIntent(context, BUNDLED_NOTIFICATION_2_ID, REPLY_ACTION),
//                PendingIntent.FLAG_UPDATE_CURRENT);
//
//        NotificationCompat.Action replyAction =
//                new NotificationCompat.Action.Builder(R.drawable.icon_action_reply,
//                        LABEL_REPLY, replyIntent)
//                        .build();
//
//        PendingIntent deleteIntent = PendingIntent.getActivity(context,
//                DELETE_INTENT_ID,
//                getActionIntent(context, BUNDLED_NOTIFICATION_2_ID, DELETE_ACTION),
//                PendingIntent.FLAG_UPDATE_CURRENT);
//
//        NotificationCompat.Action deleteAction =
//                new NotificationCompat.Action.Builder(R.drawable.icon_action_trash,
//                        LABEL_DELETE, deleteIntent)
//                        .build();
//
//        NotificationCompat.Builder notification2 = createNotificationBuilder(
//                context, "Notification 2", "Here's second notification!!");
//        notification2.setGroup(KEY_NOTIFICATION_GROUP);
//        notification2.addAction(replyAction);
//        notification2.addAction(deleteAction);


        // third notification
//        NotificationCompat.Builder notification3 = createNotificationBuilder(
//                context, "Notification 3", "This may not be part of a bundled notification!!!");


        // Summary notification
        //NotificationCompat.Builder summary = getSummaryNotification(context);
        //showNotification(context, summary.build(), BUNDLED_NOTIFICATION_SUMMARY_ID);

//        showNotification(context, notification1.build(), BUNDLED_NOTIFICATION_1_ID);
//        showNotification(context, notification2.build(), BUNDLED_NOTIFICATION_2_ID);
//
//        showNotification(context, notification3.build(), NON_BUNDLED_NOTIFICATION_ID);
    }

    private Intent getActionIntent(Context context, int notificationId, String action) {
        return new Intent(context, MainActivity.class)
                .addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
                .setAction(action)
                .putExtra(NOTIFICATION_ID, notificationId);
    }

    public String handleNotification(Intent intent, Context context) {
        String message = null;
        String action = intent.getAction();

        if (!TextUtils.isEmpty(action)) {
            int notificationId = intent.getIntExtra(NOTIFICATION_ID, -1);

            if (action.equalsIgnoreCase(NotificationManager.SIMPLE_NOTIFICATION_ACTION)) {
                cancelNotification(notificationId, context);
                message = "Simple notification is being handled";
            }
//            else if (action.equalsIgnoreCase(NotificationManager.REPLY_ACTION)) {
//                cancelNotification(notificationId, context);
//                CharSequence replyText = getRemoteInputText(intent);
//                message = "Reply action is being handled" + (!TextUtils.isEmpty(replyText) ? " with reply - " + replyText : "");
//            } else if (action.equalsIgnoreCase(NotificationManager.DELETE_ACTION)) {
//                cancelNotification(notificationId, context);
//                message = "Delete action is being handled";
//            } else if (action.equalsIgnoreCase(NotificationManager.SUMMARY_ACTION)) {
//                cancelNotification(notificationId, context);
//                message = "Bundled notification is being handled";
//            }
        }

        return message;
    }

    private void cancelNotification(int id, Context context) {
        android.app.NotificationManager manager = (android.app.NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.cancel(id);
    }

    /*
    private String getRemoteInputText(Intent intent) {
        String replyText = "";
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null) {
            CharSequence text = remoteInput.getCharSequence(KEY_TEXT_REPLY);
            replyText = text.toString();
        }
        return replyText;
    }
    */
/*
    private NotificationCompat.Builder getSummaryNotification(Context context) {

        NotificationCompat.Builder summary = createNotificationBuilder(
                context, "Summary notification", "This is summary notification");
        summary.setGroupSummary(true).setGroup(KEY_NOTIFICATION_GROUP);

        NotificationCompat.InboxStyle style = new NotificationCompat.InboxStyle();
        style.addLine("Notification 1 " + "-" + " Here's first notification!");
        style.addLine("Notification 2 "+ "-" + " Here's second notification!!");
        summary.setStyle(style);
        summary.setContentInfo("2");

        Intent launchIntent = new Intent(context, MainActivity.class);
        launchIntent.setAction(SUMMARY_ACTION);
        launchIntent.putExtra(NOTIFICATION_ID, BUNDLED_NOTIFICATION_SUMMARY_ID);

        PendingIntent pendingIntent = PendingIntent.getActivity(context, SUMMARY_INTENT_ID, launchIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);

        summary.setContentIntent(pendingIntent);

        return summary;
    }

    public void showNotificationWithReplyOption(Context context) {
        int notificationId = REMOTE_NOTIFICATION_ID;

        RemoteInput remoteInput = new RemoteInput.Builder(KEY_TEXT_REPLY)
                .setLabel(LABEL_REPLY)
                .build();

        PendingIntent replyIntent = PendingIntent.getActivity(context,
                REPLY_INTENT_ID,
                getActionIntent(context, notificationId, REPLY_ACTION),
                PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Action replyAction =
                new NotificationCompat.Action.Builder(R.drawable.icon_action_reply,
                        LABEL_REPLY, replyIntent)
                        .addRemoteInput(remoteInput)
                        .build();

        PendingIntent archiveIntent = PendingIntent.getActivity(context,
                DELETE_INTENT_ID,
                getActionIntent(context, notificationId, DELETE_ACTION),
                PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Action archiveAction =
                new NotificationCompat.Action.Builder(R.drawable.icon_action_trash,
                        LABEL_DELETE, archiveIntent)
                        .build();

        NotificationCompat.Builder builder =
                createNotificationBuilder(context, "John Snow", "How is it going?");
        builder.addAction(replyAction);
        builder.addAction(archiveAction);

        showNotification(context, builder.build(), notificationId);
    }

    public void showBundledNotifications(Context context) {
        // first notification

        NotificationCompat.Builder notification1 = createNotificationBuilder(
                context, "Notification 1", "Here's first notification!");
        notification1.setGroup(KEY_NOTIFICATION_GROUP);

        Intent launchIntent = new Intent(context, MainActivity.class);
        launchIntent.setAction(SUMMARY_ACTION);
        launchIntent.putExtra(NOTIFICATION_ID, BUNDLED_NOTIFICATION_1_ID);

        PendingIntent pendingIntent1 = PendingIntent.getActivity(context, BUNDLED_INTENT1_ID, launchIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        notification1.setContentIntent(pendingIntent1);


        // second notification with actions
        PendingIntent replyIntent = PendingIntent.getActivity(context,
                REPLY_INTENT_ID,
                getActionIntent(context, BUNDLED_NOTIFICATION_2_ID, REPLY_ACTION),
                PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Action replyAction =
                new NotificationCompat.Action.Builder(R.drawable.icon_action_reply,
                        LABEL_REPLY, replyIntent)
                        .build();

        PendingIntent deleteIntent = PendingIntent.getActivity(context,
                DELETE_INTENT_ID,
                getActionIntent(context, BUNDLED_NOTIFICATION_2_ID, DELETE_ACTION),
                PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Action archiveAction =
                new NotificationCompat.Action.Builder(R.drawable.icon_action_trash,
                        LABEL_DELETE, deleteIntent)
                        .build();

        NotificationCompat.Builder notification2 = createNotificationBuilder(
                context, "Notification 2", "Here's second notification!!");
        notification2.setGroup(KEY_NOTIFICATION_GROUP);
        notification2.addAction(replyAction);
        notification2.addAction(archiveAction);


        // third notification
        NotificationCompat.Builder notification3 = createNotificationBuilder(
                context, "Notification 3", "This may not be part of a bundled notification!!!");


        // Summary notification
        //NotificationCompat.Builder summary = getSummaryNotification(context);
        //showNotification(context, summary.build(), BUNDLED_NOTIFICATION_SUMMARY_ID);

        showNotification(context, notification1.build(), BUNDLED_NOTIFICATION_1_ID);
        showNotification(context, notification2.build(), BUNDLED_NOTIFICATION_2_ID);

        showNotification(context, notification3.build(), NON_BUNDLED_NOTIFICATION_ID);
    }
    */
}
