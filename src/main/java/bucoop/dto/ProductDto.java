package bucoop.dto;

import bucoop.model.Product;
import bucoop.model.Productall;
import java.util.List;


public interface ProductDto {
        
    public void persistProduct(Product product);
    
    public Product getProductWithId(Integer productId);
    
    public List<Product> getProducts();
    
    public List<Product> getProductList();
    
    public Productall getAllProductInfo(Integer productId);
    
    public List<Productall> getProductalls();
    
    public List<Productall> getProductallList();
    
    public Productall getAllProductInfoByProductid(Integer productId);
    
    public List<Productall> getAllProductInfoByProductname(String productName);
    
    public List<Productall> getAllProductInfoByProductdesc(String productDesc);
    
    public List<Productall> getAllProductInfoByProductactive(Boolean productActive);
    
    public List<Productall> getAllProductInfoByCategoryname(String categoryName);
    
    public List<Productall> getAllProductInfoByProducername(String producerName);
    
    public List<Productall> getAllProductInfoByProducerdesc(String producerDesc);
    
    public List<Productall> getAllProductInfoByProduceractive(Boolean producerActive);
}
