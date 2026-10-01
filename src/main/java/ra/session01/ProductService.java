package ra.session01;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final List<Product>  products = new ArrayList<>(
            Arrays.asList(
                    new Product(1, "Laptop", 1500),
                    new Product(2, "Iphone", 2000),
                    new Product(3, "Bag", 4000)
            )

    );
    //READ
    public List<Product> getAllProducts() {
        return products;
    }

    //CREATE
    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }

    //UPDATE
    public Product updateProduct(int id,  Product product) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                return p;
            }
        }
        return null;
    }

    //DELETE
   public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
   }

}
