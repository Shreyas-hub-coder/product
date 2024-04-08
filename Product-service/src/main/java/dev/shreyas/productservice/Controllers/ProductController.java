package dev.shreyas.productservice.Controllers;

import dev.shreyas.productservice.Services.ProductService;
import dev.shreyas.productservice.dtos.FakeStoreProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")

public class ProductController {
    private ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public FakeStoreProductDto getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

}
