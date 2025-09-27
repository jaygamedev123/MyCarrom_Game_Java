package com.gamestriker.repository;

import com.gamestriker.entity.RoomMembersMgt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface IRoomMemberMgtRepository extends JpaRepository<RoomMembersMgt, UUID> {
    List<RoomMembersMgt> findByRoomId(UUID roomId);
}
