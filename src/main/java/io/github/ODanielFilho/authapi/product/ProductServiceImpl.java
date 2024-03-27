package io.github.ODanielFilho.authapi.product;

import org.springframework.stereotype.Service;

import java.util.IllegalFormatCodePointException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    ProductRepository productRepository;
    @Override
    public List<Product> listAll() {
        return productRepository.findAll();
    }

    @Override
    public Product create(Product product) {
        if(product.getId() != null){
            throw new RuntimeException("to create an product, you cannot have an Id");
        }
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        if(product.getId() == null){
            throw new RuntimeException("to update an product, you must have an Id");
        }
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
