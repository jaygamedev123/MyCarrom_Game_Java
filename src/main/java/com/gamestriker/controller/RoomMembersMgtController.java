package com.gamestriker.controller;

import com.gamestriker.dto.ApiResponse;
import com.gamestriker.dto.RoomMembersDto;
import com.gamestriker.service.IRoomMembersMgtService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/room-members")
@AllArgsConstructor
public class RoomMembersMgtController {

    private final IRoomMembersMgtService iRoomMembersMgtService;

    @PostMapping
    public ApiResponse addRoomMember(@RequestBody RoomMembersDto dto) {
        return iRoomMembersMgtService.addRoomMember(dto);
    }

    @GetMapping("/{roomId}")
    public ApiResponse getRoomMembers(@PathVariable UUID roomId) {
        return iRoomMembersMgtService.getRoomMembers(roomId);
    }

    @PutMapping("/{roomMemberId}/winner/{winnerUserId}")
    public ApiResponse updateWinner(@PathVariable UUID roomMemberId, @PathVariable UUID winnerUserId) {
        return iRoomMembersMgtService.updateWinner(roomMemberId, winnerUserId);
    }


}
