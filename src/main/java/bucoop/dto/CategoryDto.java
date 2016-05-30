package bucoop.dto;

import bucoop.model.Category;
import java.util.List;


public interface CategoryDto {

    public void persistCategory(Category category);
    
    public Category getCategoryWithId(Integer categoryId);
    
    public List<Category> getCategories();
    
    public List<Category> getCategoryList();
    
}
