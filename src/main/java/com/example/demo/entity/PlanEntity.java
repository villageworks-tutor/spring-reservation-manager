package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "plans")
public class PlanEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "accommodation_id")
	private int accommodationId;
	
	private String content;
	private int rooms;
	@Column(name = "stay_count")
	private int stayCount;
	
	public PlanEntity() {}

	public PlanEntity(int accommodationId, String content, int rooms, int stayCount) {
		this.accommodationId = accommodationId;
		this.content = content;
		this.rooms = rooms;
		this.stayCount = stayCount;
	}
	
	public PlanEntity(int id, int accommodationId, String content, int rooms, int stayCount) {
		this(accommodationId, content, rooms, stayCount);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccommodationId() {
		return accommodationId;
	}

	public void setAccommodationId(int accommodationId) {
		this.accommodationId = accommodationId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getStayCount() {
		return stayCount;
	}

	public void setStayCount(int stayCount) {
		this.stayCount = stayCount;
	}
	
}
