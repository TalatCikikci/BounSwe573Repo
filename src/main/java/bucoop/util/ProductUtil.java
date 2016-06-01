package bucoop.util;

import bucoop.model.Category;
import bucoop.model.Product;
import bucoop.model.Productall;
import java.util.List;


public interface ProductUtil {
    
    boolean addProduct(String productname, String productdesc, Integer producer, Integer category, Boolean isactive);

    Product getProductById(Integer productID);
    
    List<Product> getProductList();
    
    List<Product> getProductListByItem(String searchitem);
    
    boolean deleteProduct(Integer productID);
    
    boolean addCategory(String categoryname);
    
    Category getCategoryById(Integer categoryID);
    
    List<Category> getCategoryList();
    
    List<Category> getCategoryListByItem(String searchitem);
    
    Productall getAllProductInformation(Integer productId);
    
    List<Productall> getProductInfoByKeyword(String searchitem);
    
    List<Productall> getProductalls();
}
