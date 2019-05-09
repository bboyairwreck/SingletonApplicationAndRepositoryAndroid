package com.ericchee.singletonapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_all_names.*

/**
 * This shows all the names saved in the dataManager that was modified in the MainActivity
 */
class AllNamesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_names)

        val allNames = SingletonApplication.instance.dataManager.getData()

        if (allNames.isNotEmpty()) {

            var allNamesString = ""
            allNames.forEachIndexed { index, name ->
                allNamesString += name + "\n"
            }

            tvNames.text = allNamesString
        }
    }
}
