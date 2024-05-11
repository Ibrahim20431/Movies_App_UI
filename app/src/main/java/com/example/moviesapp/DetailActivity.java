package com.example.moviesapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesapp.Classes.*;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        recyclerView = findViewById(R.id.recycle_actor_details);

        ArrayList<ActorData> actorData = new ArrayList<>();
        actorData.add(new ActorData((R.drawable.star1), "Actor name"));
        actorData.add(new ActorData((R.drawable.star2), "Actor name"));
        actorData.add(new ActorData((R.drawable.star3), "Actor name"));
        actorData.add(new ActorData((R.drawable.star4), "Actor name"));
        actorData.add(new ActorData((R.drawable.star5), "Actor name"));
        actorData.add(new ActorData((R.drawable.star6), "Actor name"));

        ActorAdapter actorAdapter = new ActorAdapter(actorData);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(actorAdapter);
    }
}