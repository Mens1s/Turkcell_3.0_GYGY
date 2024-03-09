package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.core.exception.types.BusinessException;
import com.example.turkcellmarket.entities.Brand;
import com.example.turkcellmarket.entities.Category;
import com.example.turkcellmarket.entities.Product;
import com.example.turkcellmarket.repositories.abstracts.BrandRepository;
import com.example.turkcellmarket.repositories.abstracts.CategoryRepository;
import com.example.turkcellmarket.repositories.abstracts.ProductRepository;
import com.example.turkcellmarket.services.abstracts.ProductService;
import com.example.turkcellmarket.services.dtos.product.requests.ProductAddRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final BrandRepository brandRepository;
    @Override
    public void add(ProductAddRequest productAddRequest) {

        // if(productAddRequest.getPrice() <= 0)
        //    throw new BusinessException("Ürün fiyatı sıfırın altında olamaz.", HttpStatus.BAD_REQUEST);


        Product product = new Product();

        Category category = new Category();
        category.setId(productAddRequest.getCategoryId());

        Brand brand = new Brand();
        brand.setId(productAddRequest.getBrandId());

        product.setCategory(category);
        product.setBrand(brand);
        product.setName(productAddRequest.getName());
        product.setDescription(productAddRequest.getDescription());
        product.setPrice(productAddRequest.getPrice());
        product.setStock(productAddRequest.getStock());

        productRepository.save(product);
    }

    @Override
    public List<Product> searchQuery(String query){
        return productRepository.searchByQuery(query);
    }
    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
