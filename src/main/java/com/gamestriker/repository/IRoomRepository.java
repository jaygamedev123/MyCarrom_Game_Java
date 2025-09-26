package com.gamestriker.repository;

import com.gamestriker.entity.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IRoomRepository extends JpaRepository<Rooms, UUID> {
    Optional<Rooms> findById(UUID id);
}
