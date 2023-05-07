package com.tictactoebackend.tictactoebackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Game {

    @Id
    @GeneratedValue
    private Long id;

    private String winner;

    private ArrayList<String> gameHistory;

    public Game() {}

    public Game(Long id, String winner, ArrayList<String> gameHistory) {
        this.id = id;
        this.winner = winner;
        this.gameHistory = gameHistory;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public ArrayList<String> getGameHistory() {
        return gameHistory;
    }

    public void setGameHistory(ArrayList<String> gameHistory) {
        this.gameHistory = gameHistory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
