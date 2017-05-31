import dagger.Component
import io.kamara.firebase.quickstart.android.DemoComponent
import io.kamara.firebase.quickstart.android.login.LoginActivity
import io.kamara.firebase.quickstart.android.scopes.ActivityScoped

@ActivityScoped
@Component(dependencies = arrayOf(DemoComponent::class), modules = arrayOf(LoginModule::class))
interface LoginComponent {
    fun inject(activity: LoginActivity)
}