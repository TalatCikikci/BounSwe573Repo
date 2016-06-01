package bucoop.util;

import bucoop.dto.CategoryDto;
import bucoop.dto.ProductDto;
import bucoop.model.Category;
import bucoop.model.Product;
import bucoop.model.Productall;
import java.util.ArrayList;
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
    public boolean addProduct(String productname, String productdesc, Integer producer, Integer category, Boolean isactive){
        final Product product = new Product();
        product.setProductname(productname);
        product.setProductdesc(productdesc);
        product.setProducer(producer);
        product.setCategory(category);
        product.setActive(isactive);
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
    public List<Product> getProductListByItem(String searchitem){
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
    
    @Override
    public List<Category> getCategoryListByItem(String searchitem){
        final List<Category> categoryCollection = categoryDto.getCategoryList();
        return categoryCollection;
    }
    
    @Override
    public Productall getAllProductInformation(Integer productID){
        final Productall productallinfo = productDto.getAllProductInfo(productID);
        return productallinfo;
    }
    
    @Override
    public List<Productall> getProductInfoByKeyword(String searchitem){
        final List<Productall> productCategorynameCollection = productDto.getAllProductInfoByCategoryname(searchitem);
        final List<Productall> productProducerdescCollection = productDto.getAllProductInfoByProducerdesc(searchitem);
        final List<Productall> productProducernameCollection = productDto.getAllProductInfoByProducername(searchitem);
        final List<Productall> productProductdescCollection = productDto.getAllProductInfoByProductdesc(searchitem);
        final List<Productall> productProductnameCollection = productDto.getAllProductInfoByProductname(searchitem);
        
        List<Productall> productAllInfo = new ArrayList();
        productAllInfo.addAll(productCategorynameCollection);
        productAllInfo.addAll(productProducerdescCollection);
        productAllInfo.addAll(productProducernameCollection);
        productAllInfo.addAll(productProductdescCollection);
        productAllInfo.addAll(productProductnameCollection);
     
        return productAllInfo;
    }
}
