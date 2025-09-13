package com.gamestriker.controller;

import com.gamestriker.service.impl.IRoomMembersMgtService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RoomMembersMgtController {
    // RoomMembersMgtController implementation goes here
    private final IRoomMembersMgtService roomMembersMgtService;

    public RoomMembersMgtController(IRoomMembersMgtService roomMembersMgtService) {
        this.roomMembersMgtService = roomMembersMgtService;
    }

    // Add methods to handle room members management operations

}
