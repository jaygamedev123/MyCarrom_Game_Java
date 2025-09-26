package com.gamestriker.dto;

import lombok.Data;
import java.util.UUID;

@Data
public class RoomMembersDto {

    private UUID id;
    private UUID roomId;
    private UUID creatorUserId;
    private UUID memberUserId;
    private UUID winnerUserId;
}
