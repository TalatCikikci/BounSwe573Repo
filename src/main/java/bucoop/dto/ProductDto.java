package bucoop.dto;

import bucoop.model.Product;
import java.util.List;


public interface ProductDto {
        
    public void persistProduct(Product product);
    
    public Product getProductWithId(Integer productId);
    
    public List<Product> getProducts();
    
    public List<Product> getProductList();
}
