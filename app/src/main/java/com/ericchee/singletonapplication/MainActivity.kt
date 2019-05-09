package com.ericchee.singletonapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * This class takes a name entered by user and saves it to the repository that is referenced in the Application singleton
 */
class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave.setOnClickListener {
            val newName = etEnterName.text.toString()
            saveNameInDataManager(newName)
        }

        btnViewAllNames.setOnClickListener {
            startActivity(Intent(this@MainActivity, AllNamesActivity::class.java))
        }

    }

    fun saveNameInDataManager(newName: String) {
        // get singleton of app
        val singletonApp = SingletonApplication.instance

        // get repository
        val dataManager = singletonApp.dataManager

        // add name to repository
        dataManager.add(newName)
    }
}
