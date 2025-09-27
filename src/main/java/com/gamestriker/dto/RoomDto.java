package com.gamestriker.dto;

import com.gamestriker.entity.Auditing;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class RoomDto extends Auditing {

    private UUID id;
    private LocalDateTime creationDate;
    private LocalDateTime closureDate;
    private Long gameId;


}
