package com.gamestriker.controller;

import com.gamestriker.service.IGameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
class GameController {
    // Controller methods would go here
    private  final IGameService iGameService;
    public GameController(IGameService iGameService) {
        this.iGameService = iGameService;
    }

}
