package io.kamara.firebase.quickstart.android;

import android.app.Application;
import android.content.Context;
import android.support.annotation.VisibleForTesting;

public class DemoApplication extends Application {

    private DemoComponent mComponent;

    public static DemoComponent getComponent(Context context) {
        DemoApplication app = (DemoApplication) context.getApplicationContext();
        if (app.mComponent == null) {
            app.mComponent = app.createComponent();
        }
        return app.mComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setComponent(createComponent());
    }

    @VisibleForTesting
    public void setComponent(DemoComponent component) {
        mComponent = component;
    }

    private DemoComponent createComponent() {
        return DaggerMaszinComponent
                .builder()
                .maszinModule(new DemoModule(getApplicationContext()))
                .build();
    }
}