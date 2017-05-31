package io.kamara.firebase.quickstart.android;

import android.content.Context;

@Module
public class DemoModule {

    private final Context mContext;

    public DemoModule(Context context) {
        mContext = context;
    }

    @Provides
    @ApplicationScoped
    Context provideContext() {
        return mContext;
    }
}