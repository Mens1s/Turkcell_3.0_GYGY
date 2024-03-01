package com.pairthree.turkcellmarket.entities;

import com.pairthree.turkcellmarket.entities.user.Customer;

import java.math.BigDecimal;
import java.util.List;

public class Basket extends BaseEntity{
    private Customer customer;
    private List<Product> products;
    private BigDecimal totalPrice;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
