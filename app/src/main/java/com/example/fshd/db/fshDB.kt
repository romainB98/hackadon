package com.example.fshd.db


import org.jetbrains.anko.db.classParser
import org.jetbrains.anko.db.insert
import org.jetbrains.anko.db.select


class fshDB(private val dbHelper: MySqlDBHelper = MySqlDBHelper.instance) {

    // Pour récupérer nos scores
    fun selectIdMdp() = dbHelper.use {
        select(fshTable.NAME,
            fshTable.PSEUDO, fshTable.MAIL, fshTable.MDP)
            .parseList(classParser<users>())
    }

    // Pour engistrer un score
    fun addUser(user: users) = dbHelper.use {
        insert(fshTable.NAME,
            fshTable.NOM to user.nom,
            fshTable.PRENOM to user.prenom,
            fshTable.BIRTH to user.birth,
            fshTable.SEXE to user.sexe,
            fshTable.MAIL to user.mail,
            fshTable.PSEUDO to user.pseudo,
            fshTable.MDP to user.mdp,
            fshTable.FSH to user.fsh,
            fshTable.AVATAR to user.avatar)
    }
}