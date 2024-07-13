package com.example.ef202401echenique

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.ef202401echenique.model.EquipoModel
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore

class RegistroEquiposActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_equipos)
        val etNombreEquipo: EditText = findViewById(R.id.etNombreEquipo)
        val etUrlEscudo: EditText = findViewById(R.id.etUrlEscudo)
        val btnGuardar: Button = findViewById(R.id.btnGuardar)
        val btnRegistrarEnfrentamiento: Button = findViewById(R.id.btnRegistarEnfrentamiento)
        val btnListadoEnfrentamiento: Button = findViewById(R.id.btnListadoEnfrentamiento)
        val db = FirebaseFirestore.getInstance()
        val collectionRef = db.collection("equipos")

        btnRegistrarEnfrentamiento.setOnClickListener{
            val intent = Intent(this,RegistroEnfrentamientosActivity::class.java)
            startActivity(intent)
        }
        btnListadoEnfrentamiento.setOnClickListener{
            val intent = Intent(this,ListadoEnfrentamientosActivity::class.java)
            startActivity(intent)
        }
        btnGuardar.setOnClickListener{
            val nombreEquipo = etNombreEquipo.text.toString()
            val urlEscudo = etUrlEscudo.text.toString()
            val userModel = EquipoModel(nombreEquipo,urlEscudo)
            collectionRef.add(userModel)
                .addOnCompleteListener{
                    Snackbar.make(
                        findViewById(android.R.id.content)
                        , "Registro exitoso"
                        , Snackbar.LENGTH_LONG
                    ).show()
                }.addOnFailureListener{error ->
                    Snackbar.make(
                        findViewById(android.R.id.content)
                        , "Ocurrió un error al registrar el equipo: ${error.message}"
                        , Snackbar.LENGTH_LONG
                    ).show()
                }
        }
    }

}