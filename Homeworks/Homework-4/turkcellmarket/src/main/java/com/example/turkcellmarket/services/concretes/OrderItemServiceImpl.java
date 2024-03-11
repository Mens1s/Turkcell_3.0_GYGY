package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Order;
import com.example.turkcellmarket.entities.OrderItem;
import com.example.turkcellmarket.entities.Product;
import com.example.turkcellmarket.entities.Supplier;
import com.example.turkcellmarket.repositories.abstracts.OrderItemRepository;
import com.example.turkcellmarket.services.abstracts.OrderItemService;
import com.example.turkcellmarket.services.dtos.requests.OrderItemAddRequest;
import com.example.turkcellmarket.services.dtos.responses.OrderItemGetResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemRepository orderItemRepository;

    @Override
    public void add(OrderItemAddRequest orderItemAddRequest) {
        OrderItem orderItem = new OrderItem();

        Order order = new Order();
        order.setId(orderItemAddRequest.getOrderId());
        orderItem.setOrder(order);

        Product product = new Product();
        product.setId(orderItemAddRequest.getProductId());
        orderItem.setProduct(product);

        Supplier supplier = new Supplier();
        supplier.setId(orderItemAddRequest.getSupplierId());
        orderItem.setSupplier(supplier);

        orderItem.setProductCount(orderItemAddRequest.getProductCount());
        orderItem.setPrice(orderItemAddRequest.getPrice());
        orderItemRepository.save(orderItem);
    }

    @Override
    public List<OrderItemGetResponse> getAll() {
        // TODO: Mappingle ekle
        return null;
    }
}
