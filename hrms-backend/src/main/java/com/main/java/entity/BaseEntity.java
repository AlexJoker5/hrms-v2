package com.main.java.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@MappedSuperclass
public abstract class BaseEntity {
	
	@Column(name = "create_at", updatable = false)
	private LocalDateTime createdDate;
	
	@Column(name = "update_at")
	private LocalDateTime updatedDate;
	
	@PrePersist
	protected void onCreate() {
		LocalDateTime now = LocalDateTime.now();
		this.createdDate = now;
		this.updatedDate = now;
	}
	
	@PreUpdate
	protected void onUpdate() {
		LocalDateTime now = LocalDateTime.now();
		this.updatedDate = now;
	}
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

}
