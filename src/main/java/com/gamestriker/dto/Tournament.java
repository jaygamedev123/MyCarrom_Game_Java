package com.gamestriker.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Setter;

@Entity
@Setter
public class Tournament extends Auditing {


    @Id

    private String tournamentId;

    private String gameId;
    private String tournamentName;
    private String startDate;
    private String endDate;
    private String status;

}
