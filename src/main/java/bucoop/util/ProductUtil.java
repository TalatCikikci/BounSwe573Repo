package bucoop.util;

import bucoop.model.Category;
import java.util.List;


public interface ProductUtil {
    
    boolean addProduct(String productname, String productdesc, Integer producer, Integer category);
    
    boolean deleteProduct(Integer productID);
    
    boolean addCategory(String categoryname);
    
    Category getCategoryById(Integer categoryID);
    
    List<Category> getCategoryList();
    
}