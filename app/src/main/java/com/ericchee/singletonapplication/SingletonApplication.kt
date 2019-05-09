package com.ericchee.singletonapplication

import android.app.Application

/**
 * there can only be once instance of your application running. Thus we made a variable called instance that has a references
 * to the application and any class can get a reference of that activity by just calling SingletonApplication.instance
 *
 * This allows us to have a shared repository class called DataManager that can exist across activities, fragments, etc.
 *
 * When extending Applicaiton:
 *      Do not forget to add this class in the Manifest in the <application name=[INSERT HERE] /> Otherwise it will not work
 *
 */
class SingletonApplication: Application() {

    lateinit var dataManager: DataManager
        private set

    companion object {
        lateinit var instance: SingletonApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        dataManager = DataManager()
    }


}