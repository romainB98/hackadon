package com.example.fshd.db

data class users(
        val id : Int,
        val nom : String,
        val prenom : String,
        val birth : Int,
        val sexe : String,
        val mail : String,
        val pseudo : String,
        val mdp : String,
        val fsh : Int,
        val avatar : String
)