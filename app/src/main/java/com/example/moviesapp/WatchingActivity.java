package com.example.moviesapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WatchingActivity extends AppCompatActivity {

    VideoView videoView;
    TextView movie_title;
    Button like, dislike, share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_watching);

        movie_title = findViewById(R.id.txt_movie_watch_title);
        like = findViewById(R.id.btn_watch_like);
        dislike = findViewById(R.id.btn_watch_dislike);
        share = findViewById(R.id.btn_watch_share);

        videoView = findViewById(R.id.videoView);

        String videopath = "android.resourse://" + getPackageName() + "/" + R.raw.cairokey;
        android.net.Uri uri = android.net.Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
//        videoView.start();

    }
}