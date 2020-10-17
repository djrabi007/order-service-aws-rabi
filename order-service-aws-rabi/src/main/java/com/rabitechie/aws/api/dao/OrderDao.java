package com.rabitechie.aws.api.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.rabitechie.aws.api.model.Order;

@Repository
public class OrderDao {

	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		List<Order> lstOrder = Stream.of(new Order(101, "Mobile", 1, 3000), new Order(58, "Book", 5, 4500))
				.collect(Collectors.toList());

		return lstOrder;
	}

}
