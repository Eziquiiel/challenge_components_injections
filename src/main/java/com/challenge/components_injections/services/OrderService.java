package com.challenge.components_injections.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.components_injections.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;
	
	public double total(Order order) {
		double value = order.getBasic() * order.getDiscount() / 100;
		return shippingService.shipment(order) - value;
		
 	}
	
}
