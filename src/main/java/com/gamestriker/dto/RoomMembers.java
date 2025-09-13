package com.gamestriker.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class RoomMembers extends Auditing{

    private String roomMemberId;
    private String roomId;
    private String userId;
    private String joinedAt;
    private String status; // e.g., "active", "left"
}
