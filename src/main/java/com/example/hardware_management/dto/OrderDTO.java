package com.example.hardware_management.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderDTO {
    private Long id;
    private String orderNumber;
    private Long productId;
    private String productName;
    private Integer quantity;
    private BigDecimal totalPrice;
    private String status;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
}
