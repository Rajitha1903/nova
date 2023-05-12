package com.nova.dataservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_service_relation")

public class ShopServiceRelation {
	
	
	private long id;
	private long shopId;
	private long serviceId;
	private boolean status;
	private boolean isDeleted;
	private float price;
	
	
	

}
