package dev.shreyas.productservice.Services;

import dev.shreyas.productservice.dtos.FakeStoreProductDto;

public interface ProductService {

    FakeStoreProductDto getProductById(Long id);

}
