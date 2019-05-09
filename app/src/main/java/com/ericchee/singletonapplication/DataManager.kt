package com.ericchee.singletonapplication


/**
 * Your repository. Could be data from a server, local file, shared preferences, local sqlite database, etc
 */
class DataManager {

    val names: ArrayList<String> = arrayListOf()

    fun add(name: String) {
        names.add(name)
    }

    fun getData(): ArrayList<String> = names

    fun remove(name: String) {
        names.remove(name)
    }

}