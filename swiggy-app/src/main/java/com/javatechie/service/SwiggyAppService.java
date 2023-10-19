package com.javatechie.service;

import com.javatechie.client.RestaurantServiceClient;
import com.javatechie.dto.OrderResponseDTO;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SwiggyAppService {

    @Autowired
    private RestaurantServiceClient restaurantServiceClient;

    public String greeting() {
        log.info("Welcome to Swiggy App Service");
        return "Welcome to Swiggy App Service";
    }

    public OrderResponseDTO checkOrderStatus(String orderId) {
        log.info("Checking order status for orderId: {}", orderId);
        return restaurantServiceClient.fetchOrderStatus(orderId);
    }
}
