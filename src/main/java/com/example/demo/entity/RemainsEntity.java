package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "remains")
public class RemainsEntity {
	@Column(name = "plan_id")
	private int planId;
	@Column(name = "room_count")
	private int roomCount;
	
}
