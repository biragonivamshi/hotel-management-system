package com.hotel.management.model;

import com.hotel.management.enums.RoomStatus;
import com.hotel.management.enums.RoomType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rooms")

public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private Long id;
	
	private String roomNumber;
	
	@Enumerated(EnumType.STRING)
	private RoomType roomType;
	
	private double price;
	
	private boolean available;
	
	@Enumerated(EnumType.STRING)
	private RoomStatus roomStatus;
}
