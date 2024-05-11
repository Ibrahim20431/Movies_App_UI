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

public class NewMoviesAdapter extends RecyclerView.Adapter<NewMoviesAdapter.MoviesViewHolder> {

    ArrayList<MoviesData> moviesData;
    public NewMoviesAdapter(ArrayList<MoviesData> moviesData) {
        this.moviesData = moviesData;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_holder, null , false);
        MoviesViewHolder viewHolder = new MoviesViewHolder(inflater);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        MoviesData m = moviesData.get(position);
        holder.movieImage.setImageResource(m.getImage());
        holder.movieTitle.setText(m.getTitle());
    }

    @Override
    public int getItemCount() {
        return moviesData.size();
    }

    ///ViewHolder class for recycler view
    public class MoviesViewHolder extends RecyclerView.ViewHolder {

        ImageView movieImage;
        TextView movieTitle;
        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImage = itemView.findViewById(R.id.img_movie_image);
            movieTitle = itemView.findViewById(R.id.txt_movie_title);
        }
    }
}
