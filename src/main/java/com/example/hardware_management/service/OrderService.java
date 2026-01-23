package com.example.hardware_management.service;

import com.example.hardware_management.entity.Order;
import com.example.hardware_management.entity.Product;
import com.example.hardware_management.repository.OrderRepository;
import com.example.hardware_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        if (order.getOrderNumber() == null || order.getOrderNumber().isEmpty()) {
            order.setOrderNumber("ORD-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase());
        }

        Optional<Product> product = productRepository.findById(order.getProduct().getId());
        if (product.isPresent()) {
            Product prod = product.get();
            if (order.getTotalPrice() == null) {
                order.setTotalPrice(prod.getPrice().multiply(new BigDecimal(order.getQuantity())));
            }
        }

        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order orderDetails) {
        Optional<Order> order = orderRepository.findById(id);
        if (order.isPresent()) {
            Order existingOrder = order.get();
            if (orderDetails.getStatus() != null) {
                existingOrder.setStatus(orderDetails.getStatus());
            }
            if (orderDetails.getQuantity() != null) {
                existingOrder.setQuantity(orderDetails.getQuantity());
            }
            if (orderDetails.getCustomerName() != null) {
                existingOrder.setCustomerName(orderDetails.getCustomerName());
            }
            if (orderDetails.getCustomerEmail() != null) {
                existingOrder.setCustomerEmail(orderDetails.getCustomerEmail());
            }
            if (orderDetails.getCustomerPhone() != null) {
                existingOrder.setCustomerPhone(orderDetails.getCustomerPhone());
            }
            return orderRepository.save(existingOrder);
        }
        return null;
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public List<Order> getOrdersByStatus(Order.OrderStatus status) {
        return orderRepository.findByStatus(status);
    }
}
