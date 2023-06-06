package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservations")
public class ReservationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "giest_id")
	private int guestId;
	@Column(name = "plan_id")
	private int planId;
	private int rooms;
	@Column(name = "checkin_on")
	private LocalDate checkinOn;
	
	public ReservationEntity() {}

	public ReservationEntity(int guestId, int planId, int rooms, LocalDate checkinOn) {
		this.guestId = guestId;
		this.planId = planId;
		this.rooms = rooms;
		this.checkinOn = checkinOn;
	}

	public ReservationEntity(int id, int guestId, int planId, int rooms, LocalDate checkinOn) {
		this(guestId, planId, rooms, checkinOn);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public LocalDate getCheckinOn() {
		return checkinOn;
	}

	public void setCheckinOn(LocalDate checkinOn) {
		this.checkinOn = checkinOn;
	}
	
}
