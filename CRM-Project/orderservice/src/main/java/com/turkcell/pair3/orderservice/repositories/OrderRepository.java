package com.turkcell.pair3.orderservice.repositories;

import com.turkcell.pair3.orderservice.entities.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {

}
