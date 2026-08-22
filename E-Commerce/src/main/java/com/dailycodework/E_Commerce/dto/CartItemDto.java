package com.dailycodework.E_Commerce.dto;

import com.dailycodework.E_Commerce.model.Product;

import java.math.BigDecimal;

public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}
