package com.example.fshd

import android.app.Application


class App : Application() {

    // On créeait une instance de App pour pouvoir l'utiliser dans toutes l'application
    // Exemple comme nous l'avons fait au niveau de 'MySqlDBHelper.tk'
    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {

        super.onCreate()
        instance = this
    }
}
