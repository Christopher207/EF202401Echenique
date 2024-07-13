package com.example.ef202401echenique

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.recyclerview.widget.RecyclerView

class ListadoEnfrentamientosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_enfrentamientos)
        val rvListado: RecyclerView = findViewById(R.id.rvListado)
        val btnRegistrarEquipo1: Button = findViewById(R.id.btnRegistarEquipo1)
        val btnRegistrarEnfrentamiento1: Button = findViewById(R.id.btnRegistrarEnfrentamiento1)
        btnRegistrarEquipo1.setOnClickListener {
            startActivity(Intent(this, RegistroEquiposActivity::class.java))
        }
        btnRegistrarEnfrentamiento1.setOnClickListener {
            startActivity(Intent(this, RegistroEnfrentamientosActivity::class.java))
        }


    }
}