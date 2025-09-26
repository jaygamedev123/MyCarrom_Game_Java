package com.gamestriker.controller;

import com.gamestriker.dto.ApiResponse;
import com.gamestriker.dto.RoomDto;
import com.gamestriker.service.IRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final IRoomService roomService;

    @PostMapping
    public ApiResponse createRoom(@RequestBody RoomDto roomDto) {
        return roomService.createRoom(roomDto);
    }

    @GetMapping("/{id}")
    public ApiResponse getRoom(@PathVariable UUID id) {
        return roomService.getRoom(id);
    }

    @GetMapping
    public ApiResponse getAllRooms() {
        return roomService.getAllRooms();
    }

    @PutMapping
    public ApiResponse updateRoom(@RequestBody RoomDto roomDto) {
        return roomService.updateRoom(roomDto);
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteRoom(@PathVariable UUID id) {
        return roomService.deleteRoom(id);
    }
}
