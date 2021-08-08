package com.ml.android.challenge

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.ml.android.challenge.di.DaggerChallengeMLComponent
import com.ml.android.challenge.di.ChallengeMLComponent

class ChallengeMLApp: Application() {

    //region Fields

    lateinit var component: ChallengeMLComponent
        private set

    //endregion

    //region Override Methods & Callbacks

    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

        component = initAppComponent()
    }

    //endregion

    //region Private Methods

    private fun initAppComponent() = DaggerChallengeMLComponent.factory().create(this)

    //endregion
}
