package com.betse.service;

import com.betse.entity.Room;

import java.util.List;

public interface RoomService {

    Room findByRoomName(String name);

    List<Room> findAllRooms();

    void saveRoom(Room room);

    void delete(Room room);
}


