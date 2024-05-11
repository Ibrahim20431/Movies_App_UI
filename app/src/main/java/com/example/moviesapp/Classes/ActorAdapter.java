package com.example.moviesapp.Classes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesapp.R;

import java.util.ArrayList;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ActorViewHolder> {

    ArrayList<ActorData> actorData = new ArrayList<>();
    public ActorAdapter(ArrayList<ActorData> actorData) {
        this.actorData = actorData;
    }
    @NonNull
    @Override
    public ActorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.actor_movie_holder, null, false);
        ActorViewHolder actorViewHolder = new ActorViewHolder(inflater);
        return actorViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ActorViewHolder holder, int position) {
        ActorData act_dat = actorData.get(position);
        holder.actor_image.setImageResource(act_dat.getActor_image());
        holder.actor_name.setText(act_dat.getActor_name());
    }

    @Override
    public int getItemCount() {
        return actorData.size();
    }

    class ActorViewHolder extends RecyclerView.ViewHolder{
        ImageView actor_image;
        TextView actor_name;
        public ActorViewHolder(@NonNull View itemView) {
            super(itemView);
            actor_image = itemView.findViewById(R.id.actor_image);
            actor_name = itemView.findViewById(R.id.actor_name);
        }
    }
}
