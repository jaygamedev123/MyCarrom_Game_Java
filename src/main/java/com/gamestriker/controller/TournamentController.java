package com.gamestriker.controller;

import com.gamestriker.service.ITournamentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TournamentController {
    private final ITournamentService tournamentService;

    public TournamentController(ITournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    // Add methods to handle tournament-related operations
}