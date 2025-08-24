package com.challenge.components_injections;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.challenge.components_injections.entities.Order;
import com.challenge.components_injections.services.OrderService;

@SpringBootApplication
public class ComponentsInjectionsApplication implements CommandLineRunner{

	@Autowired
	OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(ComponentsInjectionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034, 150.00, 20.0);
		
		double total = orderService.total(order);
		
		System.out.println("Pedido código: " + order.getCode());
		System.out.printf("Valor total: %.2f", total);
		
	}

}
