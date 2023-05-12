package com.nova.dataservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_ratings")

public class ShopRatings {

	private long id;
	private long shopId;
	private long consumerId;
	private float ratings;
	private String comment;
	
}
