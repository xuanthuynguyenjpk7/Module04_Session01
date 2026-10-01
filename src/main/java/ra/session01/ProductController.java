package ra.session01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//@RestController
//        ↓
//Class này nhận HTTP request
//        ↓
//và trả dữ liệu HTTP response
@RestController   //"Class này là Controller dùng để xử lý REST API."


//Bài 3
 @RequestMapping("/products") //Controller này phụ trách URL bắt đầu bằng /products.
// ví dụ: http://localhost:8080/products
//giống như địa chỉ/khu vực mà Controller phụ trách.

// BÀi 4
//@RequestMapping("/api/products")


public class ProductController {

//    // Controller cần ProductService.
//    public final ProductService productService;
//
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
    @Autowired
    private ProductService productService;


    // Nếu có HTTP GET gửi đến đường dẫn mà Controller này phụ trách, hãy chạy method này.
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
