package io.github.nkrusch.spacelaunchone.app;

import android.os.Build;
import android.support.v7.app.AppCompatDelegate;

import com.cloudinary.android.MediaManager;
import com.onesignal.OneSignal;

import java.util.HashMap;
import java.util.Map;

import io.github.nkrusch.spacelaunchone.BuildConfig;

@SuppressWarnings("SpellCheckingInspection")
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        // setup cloudinary images
        Map config = new HashMap<>();
        config.put("cloud_name", BuildConfig.CloudinaryClound);
        MediaManager.init(this, config);

        // schedule data update job service
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            SyncUtility.scheduleJob(this);

        // init cloud messaging
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
