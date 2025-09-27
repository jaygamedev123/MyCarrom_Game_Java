package com.gamestriker.service;

import com.gamestriker.dto.ApiResponse;
import com.gamestriker.dto.RoomDto;

import java.util.UUID;

public interface IRoomService {
    ApiResponse createRoom(RoomDto roomDto);
    ApiResponse getRoom(UUID id);
    ApiResponse getAllRooms();
    ApiResponse updateRoom(RoomDto roomDto);
    ApiResponse deleteRoom(UUID id);
}
