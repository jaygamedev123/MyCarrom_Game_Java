package com.gamestriker.service.impl;

public interface IRoomMembersMgtService {
    void addMemberToRoom(String roomId, String memberId);
    void removeMemberFromRoom(String roomId, String memberId);
    int getMemberCount(String roomId);

}
