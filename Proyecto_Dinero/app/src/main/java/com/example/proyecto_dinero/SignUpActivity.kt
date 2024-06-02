package com.example.proyecto_dinero

import android.os.Bundle
import android.view.View.OnCreateContextMenuListener
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
class SignUpActivity: AppCompatActivity(){
    //logica de la funcion
    /*
    *
    *
    *
    *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val usernameEditText = findViewById<EditText>(R.id.editTextUser)
        val passworEditText = findViewById<EditText>(R.id.editTextPassword)
        val signButton = findViewById<EditText>(R.id.btRegistro)
        signButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = usernameEditText.text.toString()
            //logica de coneccion con base de datos
            finish()
        }

    }

    }
}