package com.gamestriker.service.impl;

import com.gamestriker.dto.ApiResponse;
import com.gamestriker.dto.RoomDto;
import com.gamestriker.entity.Rooms;
import com.gamestriker.repository.IRoomRepository;
import com.gamestriker.service.IRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service("roomService")
@AllArgsConstructor
public class RoomServiceImpl implements IRoomService {

    private final IRoomRepository IRoomRepository;


    @Override
    public ApiResponse createRoom(RoomDto roomDto) {
        log.info("Creating room for gameId: {}", roomDto.getGameId());
        try {
            Rooms rooms = new Rooms();
            BeanUtils.copyProperties(roomDto, rooms);
            rooms.setCreationDate(LocalDateTime.now()); // auto set

            Rooms saved = IRoomRepository.save(rooms);

            return ApiResponse.builder()
                    .httpStatus(HttpStatus.CREATED)
                    .message("Room created successfully")
                    .data(saved)
                    .build();
        } catch (Exception e) {
            log.error("Error creating room for gameId: {}", roomDto.getGameId(), e);
            return ApiResponse.builder()
                    .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                    .message("Error creating room")
                    .build();
        }
    }

    @Override
    public ApiResponse getRoom(UUID id) {
        log.info("Fetching room with id: {}", id);
        try {
            return IRoomRepository.findById(id)
                    .map(room -> ApiResponse.builder()
                            .httpStatus(HttpStatus.OK)
                            .message("Room fetched successfully")
                            .data(room)
                            .build())
                    .orElseGet(() -> {
                        log.warn("Room not found with id: {}", id);
                        return ApiResponse.builder()
                                .httpStatus(HttpStatus.NOT_FOUND)
                                .message("Room not found")
                                .build();
                    });
        } catch (Exception e) {
            log.error("Error fetching room with id: {}", id, e);
            return ApiResponse.builder()
                    .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                    .message("Error fetching room")
                    .build();
        }
    }

    @Override
    public ApiResponse getAllRooms() {
        log.info("Fetching all rooms");
        try {
            return ApiResponse.builder()
                    .httpStatus(HttpStatus.OK)
                    .message("Rooms fetched successfully")
                    .data(IRoomRepository.findAll())
                    .build();
        } catch (Exception e) {
            log.error("Error fetching all rooms", e);
            return ApiResponse.builder()
                    .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                    .message("Error fetching rooms")
                    .build();
        }
    }

    @Override
    public ApiResponse updateRoom(RoomDto roomDto) {
        log.info("Updating room with id: {}", roomDto.getId());
        try {
            var existing = IRoomRepository.findById(roomDto.getId());
            if (existing.isPresent()) {
                Rooms rooms = existing.get();
                BeanUtils.copyProperties(roomDto, rooms, "creationDate"); // don't overwrite creation date

                Rooms updated = IRoomRepository.save(rooms);
                return ApiResponse.builder()
                        .httpStatus(HttpStatus.OK)
                        .message("Room updated successfully")
                        .data(updated)
                        .build();
            } else {
                log.warn("Room not found with id: {}", roomDto.getId());
                return ApiResponse.builder()
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .message("Room not found")
                        .build();
            }
        } catch (Exception e) {
            log.error("Error updating room with id: {}", roomDto.getId(), e);
            return ApiResponse.builder()
                    .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                    .message("Error updating room")
                    .build();
        }
    }

    @Override
    public ApiResponse deleteRoom(UUID id) {
        log.info("Deleting room with id: {}", id);
        try {
            if (IRoomRepository.existsById(id)) {
                IRoomRepository.deleteById(id);
                return ApiResponse.builder()
                        .httpStatus(HttpStatus.OK)
                        .message("Room deleted successfully")
                        .build();
            } else {
                log.warn("Room not found with id: {}", id);
                return ApiResponse.builder()
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .message("Room not found")
                        .build();
            }
        } catch (Exception e) {
            log.error("Error deleting room with id: {}", id, e);
            return ApiResponse.builder()
                    .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                    .message("Error deleting room")
                    .build();
        }
    }
}
