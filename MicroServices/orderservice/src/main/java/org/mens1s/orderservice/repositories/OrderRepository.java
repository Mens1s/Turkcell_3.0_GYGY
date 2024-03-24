package org.mens1s.orderservice.repositories;

import org.mens1s.orderservice.entities.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
