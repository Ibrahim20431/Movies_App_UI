package com.example.moviesapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesapp.Classes.MoviesData;
import com.example.moviesapp.Classes.NewMoviesAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView search;
    RecyclerView view1 , view2;
    String[] movies = {"Movie_1","Movie_2","Movie_3","Movie_4","Movie_5","Movie_6","Movie_7","Movie_8"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        search = findViewById(R.id.edtxt_main_search);
        view1 = findViewById(R.id.recyclerview1);
        view2 = findViewById(R.id.recyclerview2);

        ///search box////
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,movies);
        search.setAdapter(adapter);

        ////New Movires//////
        ArrayList<MoviesData> list = new ArrayList<>();
        list.add(new MoviesData((R.drawable.imag1) , "Movie_1"));
        list.add(new MoviesData((R.drawable.imag2) , "Movie_2"));
        list.add(new MoviesData((R.drawable.imag3) , "Movie_3"));
        list.add(new MoviesData((R.drawable.imag4) , "Movie_4"));
        list.add(new MoviesData((R.drawable.imag5) , "Movie_5"));
        list.add(new MoviesData((R.drawable.imag6) , "Movie_6"));
        list.add(new MoviesData((R.drawable.imag7) , "Movie_7"));
        list.add(new MoviesData((R.drawable.imag8) , "Movie_8"));

        NewMoviesAdapter adapter = new NewMoviesAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        view1.setLayoutManager(layoutManager);
        view1.setHasFixedSize(true);
        view1.setAdapter(adapter);
        //////////////////////

        ////Upcomming Movies////
        ArrayList<MoviesData> list1 = new ArrayList<>();
        list1.add(new MoviesData((R.drawable.imag1) , "Movie_1"));
        list1.add(new MoviesData((R.drawable.imag2) , "Movie_2"));
        list1.add(new MoviesData((R.drawable.imag3) , "Movie_3"));
        list1.add(new MoviesData((R.drawable.imag4) , "Movie_4"));
        list1.add(new MoviesData((R.drawable.imag5) , "Movie_5"));
        list1.add(new MoviesData((R.drawable.imag6) , "Movie_6"));
        list1.add(new MoviesData((R.drawable.imag7) , "Movie_7"));
        list1.add(new MoviesData((R.drawable.imag8) , "Movie_8"));

        NewMoviesAdapter adapter1 = new NewMoviesAdapter(list);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        view2.setLayoutManager(layoutManager1);
        view2.setHasFixedSize(true);
        view2.setAdapter(adapter1);
        ///////////////////////

    }
}