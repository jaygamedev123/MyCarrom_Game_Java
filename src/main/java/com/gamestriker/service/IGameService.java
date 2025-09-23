package com.gamestriker.service;

public interface IGameService {
    void startGame(String gameId);
    void endGame(String gameId);
    String getGameStatus(String gameId);

}
