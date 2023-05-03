package com.tictactoebackend.tictactoebackend.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashMap;


@Entity
public class Game {

    @Id
    @GeneratedValue
    private Long id;


    public Game() {

    }


    @ElementCollection
    HashMap<Integer, String> currentBoard = new HashMap<>();
    @ElementCollection
    ArrayList<HashMap<Integer, String>> gameHistory = new ArrayList<>();

    public Game(Long id, HashMap<Integer, String> currentBoard, ArrayList<HashMap<Integer, String>> gameHistory) {
        this.id = id;
        this.currentBoard = currentBoard;
        this.gameHistory = gameHistory;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public HashMap<Integer, String> getCurrentBoard(){ return currentBoard; }
    public void setCurrentBoard(HashMap<Integer, String> movesMade){ this.currentBoard = movesMade; }

    public ArrayList<HashMap<Integer, String>> getGameHistory() {return gameHistory;}

    public void setGameHistory(ArrayList<HashMap<Integer, String>> gameHistory) {this.gameHistory = gameHistory; }

    public void addMove(Integer position, String player, Game game){
        /*
        Positions should be 0-8 representing each possible position on the board such as:
        0 1 2
        3 4 5
        6 7 8
         */
        game.currentBoard.put(position, player);
        game.gameHistory.add(game.currentBoard);
    }
}

