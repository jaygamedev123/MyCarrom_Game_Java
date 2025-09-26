package com.gamestriker.service.impl;

import com.gamestriker.dto.ApiResponse;
import com.gamestriker.dto.RoomMembersDto;
import com.gamestriker.entity.RoomMembersMgt;
import com.gamestriker.repository.IRoomMemberMgtRepository;
import com.gamestriker.service.IRoomMembersMgtService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service("roomMemberService")
@AllArgsConstructor
public class RoomMembersMgtServiceImpl implements IRoomMembersMgtService {

    private final IRoomMemberMgtRepository roomMemberRepo;

    @Override
    public ApiResponse addRoomMember(RoomMembersDto dto) {
        log.info("Adding room member for roomId: {}", dto.getRoomId());
        try {
            RoomMembersMgt roomMember = new RoomMembersMgt();
            BeanUtils.copyProperties(dto, roomMember);
            RoomMembersMgt saved = roomMemberRepo.save(roomMember);
            return ApiResponse.builder()
                    .httpStatus(HttpStatus.CREATED)
                    .message("Room member added successfully")
                    .data(saved)
                    .build();
        } catch (Exception e) {
            log.error("Error adding room member for roomId: {}", dto.getRoomId(), e);
            return ApiResponse.builder()
                    .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                    .message("Error adding room member")
                    .build();
        }
    }

    @Override
    public ApiResponse getRoomMembers(UUID roomId) {
        log.info("Fetching members for roomId: {}", roomId);
        return ApiResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("Room members fetched successfully")
                .data(roomMemberRepo.findByRoomId(roomId))
                .build();
    }

    @Override
    public ApiResponse updateWinner(UUID roomMemberId, UUID winnerUserId) {
        log.info("Updating winner for roomMemberId: {}", roomMemberId);
        return roomMemberRepo.findById(roomMemberId)
                .map(roomMember -> {
                    roomMember.setWinnerUserId(winnerUserId);
                    RoomMembersMgt updated = roomMemberRepo.save(roomMember);
                    return ApiResponse.builder()
                            .httpStatus(HttpStatus.OK)
                            .message("Winner updated successfully")
                            .data(updated)
                            .build();
                })
                .orElse(ApiResponse.builder()
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .message("Room member not found")
                        .build());
    }
}
