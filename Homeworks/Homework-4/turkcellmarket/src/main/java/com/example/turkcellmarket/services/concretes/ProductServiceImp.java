package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Brand;
import com.example.turkcellmarket.entities.Category;
import com.example.turkcellmarket.entities.Product;
import com.example.turkcellmarket.repositories.abstracts.ProductRepository;
import com.example.turkcellmarket.services.abstracts.ProductService;
import com.example.turkcellmarket.services.dtos.requests.ProductAddRequest;
import com.example.turkcellmarket.services.dtos.responses.ProductGetResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImp implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void add(ProductAddRequest productAddRequest) {
//         if(productAddRequest.getPrice() <= 0) {
//             throw new BusinessException("The price cannot be equal or lower than 0", HttpStatus.BAD_REQUEST);
//         }

        Product product = new Product();

        Category category = new Category();
        category.setId(productAddRequest.getCategoryId());

        Brand brand = new Brand();
        brand.setId(productAddRequest.getBrandId());

        product.setCategory(category);
        product.setBrand(brand);
        product.setName(productAddRequest.getName());
        product.setDescription(productAddRequest.getDescription());
        product.setStock(productAddRequest.getStock());

        productRepository.save(product);
    }

    @Override
    public List<ProductGetResponse> searchQuery(String query){
        return productRepository.searchByQuery(query).stream().map(this::convertEntityToDto).toList();
    }
    @Override
    public List<ProductGetResponse> getAll() {
        return productRepository.findAll().stream().map(this::convertEntityToDto).toList();
    }

    private ProductGetResponse convertEntityToDto(Product product){
        return ProductGetResponse.builder()
                .id(product.getId())
                .description(product.getDescription())
                .name(product.getName())
                .stock(product.getStock())
                .brand(product.getBrand())
                .category(product.getCategory())
                .build();
    }
}
