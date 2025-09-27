package com.gamestriker.service;

import com.gamestriker.dto.ApiResponse;
import com.gamestriker.dto.RoomMembersDto;

import java.util.UUID;

public interface IRoomMemberService {
    ApiResponse addRoomMember(RoomMembersDto roomMemberDto);

    ApiResponse getRoomMembers(UUID roomId);

    ApiResponse updateWinner(UUID roomMemberId, UUID winnerUserId);

    ApiResponse removeRoomMember(UUID roomMemberId);

}
