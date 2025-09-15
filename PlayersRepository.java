package com.gamestriker.repository;

import com.gamestriker.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository extends JpaRepository<Players, Long> {
}
