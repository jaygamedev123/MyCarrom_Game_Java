package com.gamestriker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "room_members")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomMembersMgt extends Auditing{

    @Id
    @GeneratedValue
    private UUID id;

    private UUID roomId;         // FK reference to Room table

    private UUID creatorUserId;  // main user who created the room
    private UUID memberUserId;   // second member who joined

    private UUID winnerUserId;
}
