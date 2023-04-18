package com.tictactoebackend.tictactoebackend.repositories;

import com.tictactoebackend.tictactoebackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
