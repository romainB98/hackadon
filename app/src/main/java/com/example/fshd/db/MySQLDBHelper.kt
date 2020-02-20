package com.example.fshd.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.fshd.App
import org.jetbrains.anko.db.*


class MySqlDBHelper(ctx: Context = App.instance) : ManagedSQLiteOpenHelper(ctx,
    DB_NAME, null, DB_VERSION) {


    // Ceci représente nos constantes
    companion object {
        val DB_NAME = "fsh.db"
        val DB_VERSION = 1
        val instance by lazy { MySqlDBHelper() }
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Ici nous créeons notre table "users", si elle existe tant mieux sinon elle est crée
        db.createTable(fshTable.NAME, true, fshTable.ID to INTEGER + PRIMARY_KEY,
            fshTable.NOM to TEXT,
            fshTable.PRENOM to TEXT,
            fshTable.BIRTH to INTEGER,
            fshTable.SEXE to TEXT,
            fshTable.MAIL to TEXT,
            fshTable.PSEUDO to TEXT,
            fshTable.MDP to TEXT,
            fshTable.FSH to INTEGER,
            fshTable.AVATAR to TEXT

        )
    }

    // Mettre à jour notre base de donnée à la nouvelle version
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.dropTable(fshTable.NAME, true)
        onCreate(db)
    }

}