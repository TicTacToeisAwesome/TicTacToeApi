package com.tictactoebackend.tictactoebackend.controllers;

import com.tictactoebackend.tictactoebackend.models.Game;
import com.tictactoebackend.tictactoebackend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @PostMapping("/game")
    Game newGame(@RequestBody Game newGame) {return gameRepository.save(newGame);}

    @GetMapping("/games")
    List<Game> getAllGames() {
        return gameRepository.findAll();
    }
}