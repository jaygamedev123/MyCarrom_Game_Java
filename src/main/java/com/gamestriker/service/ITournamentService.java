package com.gamestriker.service;

public interface ITournamentService {
    void createTournament(String name, String game, String date);

    void updateTournament(int id, String name, String game, String date);

    void deleteTournament(int id);

    String getTournamentDetails(int id);

    String getAllTournaments();

    String getTournamentsByGame(String game);

    String getActiveTournaments();
}
