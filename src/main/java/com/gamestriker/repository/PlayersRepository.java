package com.gamestriker.repository;

import com.gamestriker.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayersRepository extends JpaRepository<Players, Long> {
    Optional<Players> findByUsername(String username);
}
