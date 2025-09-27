package com.gamestriker.controller;

import com.gamestriker.dto.ApiResponse;
import com.gamestriker.dto.RoomMembersDto;
import com.gamestriker.service.IRoomMemberService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/room-members")
@AllArgsConstructor
public class RoomMemberController {

    private final IRoomMemberService iRoomMemberService;

    @PostMapping
    public ApiResponse addRoomMember(@RequestBody RoomMembersDto dto) {
        return iRoomMemberService.addRoomMember(dto);
    }

    @GetMapping("/{roomId}")
    public ApiResponse getRoomMembers(@PathVariable UUID roomId) {
        return iRoomMemberService.getRoomMembers(roomId);
    }

    @PutMapping("/{roomMemberId}/winner/{winnerUserId}")
    public ApiResponse updateWinner(@PathVariable UUID roomMemberId, @PathVariable UUID winnerUserId) {
        return iRoomMemberService.updateWinner(roomMemberId, winnerUserId);
    }

    @DeleteMapping("/{memberId}")
    public ApiResponse removeMember(@PathVariable UUID memberId) {
        return iRoomMemberService.removeRoomMember(memberId);
    }
}
