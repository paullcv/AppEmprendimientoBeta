package com.example.crud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListElement> mData;

    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }


    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.id.setText(mData.get(position).getId());
        holder.nombre.setText(mData.get(position).getNombre());
        holder.telefono.setText(mData.get(position).getTelefono());
        holder.direccion.setText(mData.get(position).getDireccion());
        holder.ubicacion.setText(mData.get(position).getUbicacion());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iconImage;
        TextView id,nombre,telefono,direccion,ubicacion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImageView);
            id = itemView.findViewById(R.id.idTV);
            nombre = itemView.findViewById(R.id.nameTV);
            telefono = itemView.findViewById(R.id.telefonoTV);
            direccion = itemView.findViewById(R.id.direccionTV);
            ubicacion = itemView.findViewById(R.id.ubicacionTV);
        }
    }

}
