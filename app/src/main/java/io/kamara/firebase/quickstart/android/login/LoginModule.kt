import android.app.Activity
import dagger.Module
import dagger.Provides
import io.kamara.firebase.quickstart.android.login.LoginActivity
import io.kamara.firebase.quickstart.android.scopes.ActivityScoped

@Module
internal class LoginModule(private val activity: LoginActivity) {

    @Provides
    @ActivityScoped
    internal fun provideActivity(): Activity {
        return activity
    }
}