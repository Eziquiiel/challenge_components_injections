package com.challenge.components_injections.services;

import org.springframework.stereotype.Service;

import com.challenge.components_injections.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		
		double value = 0.0;
		if (order.getBasic() < 100) {
			value = order.getBasic() + 20.00;
		}
		else if (order.getBasic() <= 200) {
			value =  order.getBasic() + 12.00;
		}
		else if(order.getBasic() > 200) {
			value =  order.getBasic();
		}
		return value;
	}
	
}
