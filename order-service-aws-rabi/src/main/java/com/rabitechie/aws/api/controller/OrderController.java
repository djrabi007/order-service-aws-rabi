package com.rabitechie.aws.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabitechie.aws.api.dao.OrderDao;
import com.rabitechie.aws.api.model.Order;

@RestController
public class OrderController {

	@Autowired
	private OrderDao orderdao;

	@GetMapping("/orders")
	public List<Order> fetchOrder() {
		return orderdao.getOrders();
	}

}
