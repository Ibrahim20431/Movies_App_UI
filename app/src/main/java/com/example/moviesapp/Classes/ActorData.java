package com.example.moviesapp.Classes;

public class ActorData {
    int actor_image;
    String actor_name;

    public ActorData(int actor_image, String actor_name) {
        this.actor_image = actor_image;
        this.actor_name = actor_name;
    }

    public void setActor_image(int actor_image) {
        this.actor_image = actor_image;
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    public int getActor_image() {
        return actor_image;
    }

    public String getActor_name() {
        return actor_name;
    }
}
