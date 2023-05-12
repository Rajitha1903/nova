package com.nova.dataservice.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="promotionans")
public class Promotionans {
private Long id;
private Long shopId;
private Boolean isPercentage;
private Boolean isAmount;
private Long percentageValue;
private Float amountValue;
private LocalDateTime startDate;
private LocalDateTime endDate;
private String promotionName;
private Long minServiceCountlel;
}
