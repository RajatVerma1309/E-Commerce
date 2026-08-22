package com.dailycodework.E_Commerce.dto;

import com.dailycodework.E_Commerce.model.Cart;
import com.dailycodework.E_Commerce.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}
