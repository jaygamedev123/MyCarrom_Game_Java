package com.gamestriker.service.impl;

import com.gamestriker.service.IGameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
class GameServiceImpl implements IGameService {

    @Override
    public void startGame(String gameId) {

    }

    @Override
    public void endGame(String gameId) {

    }

    @Override
    public String getGameStatus(String gameId) {
        return null;
    }
}
