package com.example.ef202401echenique

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class RegistroEnfrentamientosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_enfrentamientos)

        val spnEquipoLocal: Spinner = findViewById(R.id.spnEquipoLocal)
        val spnEquipoVisiante: Spinner = findViewById(R.id.spnEquipoVisitante)
        val etCuotaLocal: EditText = findViewById(R.id.etCuotaLocal)
        val etCuotaEmpate: EditText = findViewById(R.id.etCuotaEmpate)
        val etCuotaVisitante: EditText = findViewById(R.id.etCuotaVisita)
        val btnRegistrar: Button = findViewById(R.id.btnRegistrar)
        val btnRegistrarEquipos: Button = findViewById(R.id.btnRegistrarEquipos)
        val btnListadoEnfrentamientos: Button = findViewById(R.id.btnListaEnfrentamientos)

        btnRegistrarEquipos.setOnClickListener {
            val intent = Intent(this, RegistroEquiposActivity::class.java)
            startActivity(intent)
        }
        btnListadoEnfrentamientos.setOnClickListener {
            val intent = Intent(this,ListadoEnfrentamientosActivity::class.java)
            startActivity(intent)
        }
    }
}