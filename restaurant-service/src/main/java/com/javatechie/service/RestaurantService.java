package com.javatechie.service;

import com.javatechie.dao.RestaurantOrderDAO;
import com.javatechie.dto.OrderResponseDTO;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RestaurantService {
    @Autowired
    private RestaurantOrderDAO orderDAO;

    public String greeting() {
    	log.info("Welcome to Swiggy Restaurant service");
        return "Welcome to Swiggy Restaurant service";
    }

    public OrderResponseDTO getOrder(String orderId) {
    	log.info("checking resaurant service for order id {}",orderId);
        return orderDAO.getOrders(orderId);
    }
}
