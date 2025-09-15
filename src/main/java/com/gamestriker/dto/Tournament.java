package com.gamestriker.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Tournament extends Auditing {
    @Id
    private String tournamentId;
    private String gameId;
    private String tournamentName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status;


}
