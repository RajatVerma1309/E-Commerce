package com.dailycodework.E_Commerce.service.order;

import com.dailycodework.E_Commerce.dto.OrderDto;
import com.dailycodework.E_Commerce.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
