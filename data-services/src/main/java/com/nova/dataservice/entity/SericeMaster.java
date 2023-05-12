package com.nova.dataservice.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="serice_master")
public class SericeMaster {	
	
	
	private Long id;
	
	private String name;
	
	private Long shopTypeId;
	
	private Boolean status;
	
	private Boolean isDeleted;
	
}