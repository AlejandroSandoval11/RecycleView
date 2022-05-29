package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.JugadoresAdpter
import com.example.recyclerview.model.Jugadores

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaPersonaje = ArrayList<Jugadores>()

        listaPersonaje.add(Jugadores("Alexis Vega", "https://www.debate.com.mx/__export/1633127055504/sites/debate/img/2021/10/01/alexis-vega-chivas_crop1633127053225.jpg_423682103.jpg"))

        miRecycler = findViewById(R.id.recycleJugador)
        miRecycler.adapter = JugadoresAdpter(listaPersonaje)
        miRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
    }
}