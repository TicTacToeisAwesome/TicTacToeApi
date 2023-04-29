package com.tictactoebackend.tictactoebackend.models;

import jakarta.persistence.Id;


public class Game {
    @Id
    long id;



    public Game(long id){
        this.id = id;
    }
    public long getId() {
        return id;
    }
}
