package com.gamestriker.service.impl;

public interface ITournamentRoomService {
    void createTournamentRoom(String roomName, int capacity);

    void updateTournamentRoom(int roomId, String roomName, int capacity);

    void deleteTournamentRoom(int roomId);

    String getTournamentRoomDetails(int roomId);

    String getAllTournamentRooms();

    String getAvailableTournamentRooms();
}
