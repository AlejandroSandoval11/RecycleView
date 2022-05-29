package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.example.recyclerview.R
import com.example.recyclerview.model.Jugadores

class JugadoresAdpter( private val ListaJugadores: ArrayList<Jugadores>): RecyclerView.Adapter<JugadoresAdpter.JugadoresHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JugadoresHolder {
        val vistaIndi = LayoutInflater.from(parent.context).inflate(R.layout.vista_individual,parent,false)
        return JugadoresHolder(vistaIndi)
    }

    override fun onBindViewHolder(holder: JugadoresHolder, position: Int) {
        holder.tvNombre.text = ListaJugadores[position].nombre
        Picasso.get().load(ListaJugadores[position].foto).into(holder.ivFondo)
    }

    override fun getItemCount(): Int {
        return ListaJugadores.size
    }

    class JugadoresHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val ivFondo:ImageView
        val tvNombre:TextView

        init {
            ivFondo = itemView.findViewById(R.id.ivFondo)
            tvNombre = itemView.findViewById(R.id.tvNombre)
        }
    }
}