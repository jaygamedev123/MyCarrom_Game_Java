package com.gamestriker.service;

import com.gamestriker.service.impl.IRoomMembersMgtService;
import org.springframework.stereotype.Service;

@Service
public class RoomMembersMgtServiceImpl implements IRoomMembersMgtService {

    @Override
    public void addMemberToRoom(String roomId, String memberId) {

    }

    @Override
    public void removeMemberFromRoom(String roomId, String memberId) {

    }

    @Override
    public int getMemberCount(String roomId) {
        return 0;
    }
}
