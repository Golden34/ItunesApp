package com.example.itunesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.itunesapp.dto.AdapterCanciones;
import com.example.itunesapp.dto.Cancion;
import com.example.itunesapp.dto.ResultadoCanciones;
import com.example.itunesapp.remote.QueryItunes;
import com.example.itunesapp.util.InternetUtil;

import java.net.CacheRequest;
import java.util.ArrayList;

public class ItunesActivity extends AppCompatActivity {

    private RecyclerView recView;
    private ArrayList<Cancion> datos;
    private AdapterCanciones adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void actualizarLista (ResultadoCanciones rc)
    {
        Log.d("MIAPP", "Ocultando");
        ProgressBar pb = findViewById(R.id.barra_progreso);
        pb.setVisibility(View.GONE);

        recView = (RecyclerView) findViewById(R.id.RecView);
        //recView.setHasFixedSize(true);//opcional, si sé que el tamaño no va a cambiar

        adaptador = new AdapterCanciones(rc);
        recView.setAdapter(adaptador);
        recView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //recView.setLayoutManager(new GridLayoutManager(this,3));
        //StaggeredGridLayoutManager para celdas de tamaño variable
        //recView.setLayoutManager(new StaggeredGridLayoutManager());

        //ITEM DECORATOR --> OPCIONAL

        recView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));





    }

    public void Buscar(View view) {
        if (InternetUtil.hayInternet(this)) {
            ProgressBar pb = findViewById(R.id.barra_progreso);
            pb.setVisibility(View.VISIBLE);

            QueryItunes queryItunes = new QueryItunes(this);
            EditText caja_buscar = (EditText)findViewById(R.id.buscar);
            queryItunes.execute(caja_buscar.getText().toString());
        } else
        {
            Toast aviso = Toast.makeText(this, "NO HAY INTERNET", Toast.LENGTH_SHORT);
            aviso.show();
        }
    }
}
