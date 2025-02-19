package com.hotel.management.serviceImp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.management.dto.RoomDTO;
import com.hotel.management.model.Room;
import com.hotel.management.repository.RoomRepo;
import com.hotel.management.service.RoomService;
@Service
public class RoomServiceImpl implements RoomService{
	
	private final RoomRepo roomRepo;
    private final ModelMapper modelMapper;

    @Autowired
    public RoomServiceImpl(RoomRepo roomRepository, ModelMapper modelMapper) {
        this.roomRepo = roomRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public RoomDTO createRoom(RoomDTO roomDTO) {
        Room room = modelMapper.map(roomDTO, Room.class);
        Room savedRoom = roomRepo.save(room);
        return modelMapper.map(savedRoom, RoomDTO.class);
    }

}
