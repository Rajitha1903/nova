package com.nova.dataservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_details")
public class ShopDetails {
	
	private int id;
	private String shopName;
	private String shopAddress;
	private String latitude;
	private String logitude;
	private String email;
	private String phone;
	private String logo;
	private LocalDateTime createdAt;
	private Boolean status;
	private Boolean isDeleted;
	private long shopType;
	

}
