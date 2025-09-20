package com.gamestriker.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Builder
public class TournamentRooms extends Auditing {
    @Id
    private String roomId;
    private String tournamentId;
    private String roomName;
    private String capacity;
    private String status; // e.g., "open", "closed"


}
