package com.nova.dataservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

// Nan Maga LOHITH
@Entity
@Table(name="appointment_dtails")
public class AppointmentDetails 
{
private Long id;
private UserDetails cunsumerId;
private ShopDetails ShopId;
private Long slotId;
private Boolean status;
private Boolean isDeleted;
private LocalDateTime createedAt;
private LocalDateTime updatedAt;

}
