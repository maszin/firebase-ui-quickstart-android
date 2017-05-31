package io.kamara.firebase.quickstart.android;

import android.content.Context;

@ApplicationScoped
@Component(modules = {DemoModule.class})
public interface DemoComponent {

    Context getContext();
}