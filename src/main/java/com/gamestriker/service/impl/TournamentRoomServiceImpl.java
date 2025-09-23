package com.gamestriker.service.impl;


import com.gamestriker.service.ITournamentRoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
class TournamentRoomServiceImpl implements ITournamentRoomService {

    @Override
    public void createTournamentRoom(String roomName, int capacity) {

    }

    @Override
    public void updateTournamentRoom(int roomId, String roomName, int capacity) {

    }

    @Override
    public void deleteTournamentRoom(int roomId) {

    }

    @Override
    public String getTournamentRoomDetails(int roomId) {
        return null;
    }

    @Override
    public String getAllTournamentRooms() {
        return null;
    }

    @Override
    public String getAvailableTournamentRooms() {
        return null;
    }
}
