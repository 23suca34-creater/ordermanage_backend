package com.example.hardware_management.service;

import com.example.hardware_management.entity.Product;
import com.example.hardware_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            Product existingProduct = product.get();
            if (productDetails.getName() != null) {
                existingProduct.setName(productDetails.getName());
            }
            if (productDetails.getDescription() != null) {
                existingProduct.setDescription(productDetails.getDescription());
            }
            if (productDetails.getPrice() != null) {
                existingProduct.setPrice(productDetails.getPrice());
            }
            if (productDetails.getQuantity() != null) {
                existingProduct.setQuantity(productDetails.getQuantity());
            }
            if (productDetails.getCategory() != null) {
                existingProduct.setCategory(productDetails.getCategory());
            }
            if (productDetails.getSku() != null) {
                existingProduct.setSku(productDetails.getSku());
            }
            return productRepository.save(existingProduct);
        }
        return null;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }
}
