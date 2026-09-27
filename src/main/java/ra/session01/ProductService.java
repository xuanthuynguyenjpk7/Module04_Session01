package ra.session01;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final List<Product>  products = Arrays.asList(
            new Product(1, "Laptop", 1500),
            new Product(2, "Iphone", 2000),
            new Product(3, "Bag", 4000)
    );

    public List<Product> getAllProducts() {
        return products;
    }
}
