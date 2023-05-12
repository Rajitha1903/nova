package com.nova.dataservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_employee_ower_relation")
public class ShopEmployeeOwerRelation {
	private Long id;
	private UserDetails ownerId;
	private ShopDetails ShopId;
	private UserDetails employeeId;
	private LocalDateTime joinDate;
	private Boolean status;
	private Boolean isDeleted;
	
	
}