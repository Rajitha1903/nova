package com.nova.dataservice.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_availibility")
public class ShopAvailibility {
	
	private Long id;
	
	
	private LocalDateTime fromDate;
	
	
	private LocalDateTime toDate;
	
	
	private LocalTime fromTime;
	
	
	private LocalTime toTime;
	
	
	private LocalTime interval;
	
	private Long  shopId;
	
	
	private String status;
	
	
	private String isDeleted;
	
	public ShopAvailibility() {
		
	}

}
