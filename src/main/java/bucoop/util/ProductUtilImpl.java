package bucoop.util;

import bucoop.dto.CategoryDto;
import bucoop.model.Category;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductUtilImpl implements ProductUtil{
    
    @Autowired
    private CategoryDto categoryDto;
    
    @Override
    public boolean addProduct(String productname, String productdesc, Integer producer, Integer category){
        return true;
    }
    
    
    @Override
    public boolean deleteProduct(Integer productID){
        return true;
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
