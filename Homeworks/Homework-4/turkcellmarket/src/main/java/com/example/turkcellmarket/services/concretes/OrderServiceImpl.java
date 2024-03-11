package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Address;
import com.example.turkcellmarket.entities.Customer;
import com.example.turkcellmarket.entities.Order;
import com.example.turkcellmarket.entities.Payment;
import com.example.turkcellmarket.repositories.abstracts.OrderRepository;
import com.example.turkcellmarket.services.abstracts.OrderService;
import com.example.turkcellmarket.services.dtos.requests.OrderAddRequest;
import com.example.turkcellmarket.services.dtos.responses.OrderGetResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public void add(OrderAddRequest orderAddRequest) {
        Order order = new Order();

        Customer customer = new Customer();
        customer.setId(orderAddRequest.getCustomerId());
        order.setCustomer(customer);

        Address address = new Address();
        address.setId(orderAddRequest.getAddressId());
        order.setAddress(address);

        Payment payment = new Payment();
        payment.setId(orderAddRequest.getPaymentId());
        order.setPayment(payment);

        order.setTotalPrice(orderAddRequest.getTotalPrice());
        order.setDate(new Date().toString());
        orderRepository.save(order);
    }

    @Override
    public List<OrderGetResponse> getAll() {
        // TODO: Mappingle ekle
        return null;
    }
}
