package com.gamestriker.service;

public interface IRoomMembersMgtService {
    void addMemberToRoom(String roomId, String memberId);
    void removeMemberFromRoom(String roomId, String memberId);
    int getMemberCount(String roomId);

}
