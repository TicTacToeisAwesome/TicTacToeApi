package com.tictactoebackend.tictactoebackend.models;

import jakarta.persistence.EntityManager;

public class GameRetriever
{
    EntityManager em;


    public Game retrieveGame(long id){
        return em.find(Game.class, id);
    }
}
