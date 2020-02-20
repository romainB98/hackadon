package com.example.fshd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        labelSignIn.setOnClickListener {
            val inscription: Intent = Intent(this, inscription::class.java)
            
            startActivity(inscription)
        }

    }
}
