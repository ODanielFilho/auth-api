package io.github.ODanielFilho.authapi.product;

import org.springframework.security.core.parameters.P;

import java.util.List;

public interface ProductService {
    List<Product> listAll();
    Product create(Product product);
    Product update(Product product);
    void delete(Long id);
}
