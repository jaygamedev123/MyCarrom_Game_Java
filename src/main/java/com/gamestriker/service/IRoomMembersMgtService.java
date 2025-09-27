package com.gamestriker.service;

import com.gamestriker.dto.RoomMembersDto;
import com.gamestriker.dto.ApiResponse;

import java.util.UUID;

public interface IRoomMembersMgtService {
    ApiResponse addRoomMember(RoomMembersDto roomMemberDto);
    ApiResponse getRoomMembers(UUID roomId);
    ApiResponse updateWinner(UUID roomMemberId, UUID winnerUserId);

}
