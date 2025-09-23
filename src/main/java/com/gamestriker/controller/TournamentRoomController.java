package com.gamestriker.controller;


import com.gamestriker.service.ITournamentRoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
class TournamentRoomController {
    private final ITournamentRoomService tournamentRoomService;

    public TournamentRoomController(ITournamentRoomService tournamentRoomService) {
        this.tournamentRoomService = tournamentRoomService;
    }

    // Add methods to handle tournament room-related operations

}