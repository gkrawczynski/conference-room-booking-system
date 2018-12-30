package com.betse.repository;
import com.betse.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {

    Room findByName(String name);

    List<Room> findAll();
}
