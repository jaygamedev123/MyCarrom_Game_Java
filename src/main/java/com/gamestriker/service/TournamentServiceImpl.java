package com.gamestriker.service;

import com.gamestriker.service.impl.ITournamentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("tournamentService")
public class TournamentServiceImpl implements ITournamentService {
    @Override
    public void createTournament(String name, String game, String date) {

    }

    @Override
    public void updateTournament(int id, String name, String game, String date) {

    }

    @Override
    public void deleteTournament(int id) {

    }

    @Override
    public String getTournamentDetails(int id) {
        return null;
    }

    @Override
    public String getAllTournaments() {
        return null;
    }

    @Override
    public String getTournamentsByGame(String game) {
        return null;
    }

    @Override
    public String getActiveTournaments() {
        return null;
    }
}
