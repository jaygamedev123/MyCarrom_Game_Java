package com.gamestriker.controller;

import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Tournament", description = "Tournament management APIs")
@RestController
@RequestMapping("/api/tournaments")
public class TournamentController {

    @GetMapping
    public String getAllTournaments() {
        return "List of tournaments";
    }

    @PostMapping
    public String createTournament() {
        return "Create a tournament";
    }

    // Add more endpoints here
}
