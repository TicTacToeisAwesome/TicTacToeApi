package com.tictactoebackend.tictactoebackend.repositories;

import com.tictactoebackend.tictactoebackend.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
