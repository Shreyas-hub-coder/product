package dev.shreyas.productservice.Services;

import dev.shreyas.productservice.dtos.FakeStoreProductDto;
import dev.shreyas.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService {

    @Override
    public FakeStoreProductDto getProductById(Long id) {

        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto =
                restTemplate.getForObject("https://fakestoreapi.com/products/" + id,
                        FakeStoreProductDto.class);
        return fakeStoreProductDto;



    }
}
