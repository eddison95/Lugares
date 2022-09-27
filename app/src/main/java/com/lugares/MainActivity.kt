package com.lugares

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.lugares.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Definicion del objeto para hacer la autenticacion
    private lateinit var auth : FirebaseAuth
    private lateinit var binding: ActivityMainBinding // Sirve como enlace al archivo activity_main.xml

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Debe colocarse siempre que creo un proyecto nuevo
        setContentView(binding.root)                            // Debe colocarse siempre que creo un proyecto nuevo
        FirebaseApp.initializeApp(this)      // Debe colocarse siempre que creo un proyecto nuevo
        auth = Firebase.auth                         // Debe colocarse siempre que creo un proyecto nuevo

    }
}