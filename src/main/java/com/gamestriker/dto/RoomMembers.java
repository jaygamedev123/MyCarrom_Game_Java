package com.gamestriker.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class RoomMembers extends Auditing{
    @Id

    private String roomMemberId;
    private String roomId;
    private String userId;
    private String joinedAt;
    private String status; // e.g., "active", "left"
}
