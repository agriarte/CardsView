package com.example.pedro.cardsview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pedro on 13/09/2017.
 */

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>{
    private List<Anime> items;


    @Override
    public AnimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_card,parent,false);

        return new AnimeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AnimeViewHolder holder, int position) {
        holder.imagen.setImageResource(items.get(position).getImagen());
        holder.nombre.setText(items.get(position).getNombre());
        holder.visitas.setText("Visitas:"+String.valueOf(items.get(position).getVisitas()));

    }
    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class AnimeViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView visitas;

        public AnimeViewHolder (View v){
            super(v);
            imagen = (ImageView) v.findViewById(R.id.IDimagen);
            nombre = (TextView) v.findViewById(R.id.IDnombre);
            visitas = (TextView) v.findViewById(R.id.IDvisitas);
        }
    }

    public AnimeAdapter(List<Anime> items) {
        this.items = items;
    }


}
