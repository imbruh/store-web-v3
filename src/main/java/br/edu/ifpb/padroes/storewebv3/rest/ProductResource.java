package br.edu.ifpb.padroes.storewebv3.rest;

import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductResource {

    private final ProductRepository productRepository;

    public ProductResource(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public List<Product> listProducts() {
        return productRepository.getProductList();
    }

    @PostMapping("/")
    public ResponseEntity<Void> createProduct(@RequestBody Product product) {
        if (productRepository.add(product)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @DeleteMapping("/")
    public ResponseEntity<Void> deleteProduct(@RequestBody Product product) {
        productRepository.remove(product);
        return ResponseEntity.ok().build();
    }

    
}
