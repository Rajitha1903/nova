package com.nova.dataservice.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_employee_ower_relation")
public class ShopEmployeeOwerRelation {
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="owner_id")
	private Long ownerId;
	
	@Column(name="Shop_id")
	private Long ShopId;
	
	@Column(name="employee_id")
	private Long employeeId;
	
	@Column(name="join_date")
	private LocalDateTime joinDate;
	
	@Column(name="status")
	private Boolean status;
	
	@Column(name="is_deleted")
	private Boolean isDeleted;
	
	public ShopEmployeeOwerRelation() {

}
	public ShopEmployeeOwerRelation(Long id, Long ownerId, Long shopId, Long employeeId, LocalDateTime joinDate,
			Boolean status, Boolean isDeleted) {
		super();
		this.id = id;
		this.ownerId = ownerId;
		ShopId = shopId;
		this.employeeId = employeeId;
		this.joinDate = joinDate;
		this.status = status;
		this.isDeleted = isDeleted;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	public Long getShopId() {
		return ShopId;
	}
	public void setShopId(Long shopId) {
		ShopId = shopId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDateTime getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDateTime joinDate) {
		this.joinDate = joinDate;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "ShopEmployeeOwerRelation [id=" + id + ", ownerId=" + ownerId + ", ShopId=" + ShopId + ", employeeId="
				+ employeeId + ", joinDate=" + joinDate + ", status=" + status + ", isDeleted=" + isDeleted + "]";
	}
}