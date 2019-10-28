package com.example.itunesapp.dto;

//import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.itunesapp.R;

import java.util.ArrayList;

public class AdapterCanciones extends RecyclerView.Adapter<CancionViewHolder> {

    private ArrayList<Cancion> datos;

    //Creo la vista, con el Holder dentro
    @Override
    public CancionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CancionViewHolder libroViewHolder = null;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_cancion_item, parent, false);
        libroViewHolder = new CancionViewHolder(itemView);

        return libroViewHolder;
    }

    //Al holder, le meto la info de libro que toca
    @Override
    public void onBindViewHolder(CancionViewHolder holder, int position) {

        Cancion can = datos.get(position);
        holder.cargarCancionEnHolder(can);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public AdapterCanciones(ArrayList<Cancion> libros)
    {
        this.datos = libros;
    }
}
