package io.kamara.firebase.quickstart.android.login

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import io.kamara.firebase.quickstart.android.R

class LoginActivity : Activity(), LoginContract.Navigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    companion object {

        fun newStartIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }
}