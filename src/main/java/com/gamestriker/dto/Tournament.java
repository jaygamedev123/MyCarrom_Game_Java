package com.gamestriker.dto;

import jakarta.persistence.Entity;
import lombok.Setter;

@Entity
@Setter
public class Tournament extends Auditing {
    private String tournamentId;
    private String gameId;
    private String tournamentName;
    private String startDate;
    private String endDate;
    private String status;

}
