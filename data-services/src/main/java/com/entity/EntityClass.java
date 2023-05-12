package com.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="slot_availibility")

public class EntityClass {
	
	private int id;
	
	private Date date;

	private int time;
	
	private String app_status;
	
	private Boolean staus;
	
    private Boolean	 is_deleted;

	private Date app_created_date;
	
	private Long shop_id;
	
	private Long counsumer_id;

	private String reson_for_calncel;
	
	private Date updated_date;
	
	
	

}
