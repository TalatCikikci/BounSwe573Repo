package bucoop.util;

import bucoop.dto.CategoryDto;
import bucoop.dto.ProductDto;
import bucoop.model.Category;
import bucoop.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductUtilImpl implements ProductUtil{
    
    @Autowired
    private CategoryDto categoryDto;
    
    @Autowired
    private ProductDto productDto;
    
    
    @Override
    public boolean addProduct(String productname, String productdesc, Integer producer, Integer category){
        final Product product = new Product();
        product.setProductname(productname);
        product.setProductdesc(productdesc);
        product.setProducer(producer);
        product.setCategory(category);
        productDto.persistProduct(product);
        return true;
    }
    
    @Override
    public boolean deleteProduct(Integer productID){
        return true;
    }
    
    @Override
    public List<Product> getProductList(){
        final List<Product> productCollection = productDto.getProductList();
        return productCollection;
    }
    
    @Override
    public Product getProductById(Integer productID) {
        Product producttitle = productDto.getProductWithId(productID);
        return producttitle;
    }
    
    @Override
    public boolean addCategory(String categoryname){
        final Category category = new Category();
        category.setCategoryname(categoryname);
        categoryDto.persistCategory(category);
        return true;
    }
    
    @Override
    public List<Category> getCategoryList(){
        final List<Category> categoryCollection = categoryDto.getCategoryList();
        return categoryCollection;
    }
    
    @Override
    public Category getCategoryById(Integer categoryID) {
        Category categoryname = categoryDto.getCategoryWithId(categoryID);
        return categoryname;
    }
}
