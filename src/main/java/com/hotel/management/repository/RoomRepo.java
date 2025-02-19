package com.hotel.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.management.model.Room;

public interface RoomRepo extends JpaRepository<Room,Long>{

}
