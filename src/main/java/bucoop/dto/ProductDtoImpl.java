package bucoop.dto;

import bucoop.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductDtoImpl implements ProductDto{
   
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void persistProduct(Product product) {
        entityManager.persist(product);
    }
    
    @Override
    public Product getProductWithId(Integer productId) {
        final Product product = entityManager.find(Product.class, productId);
        if (product == null) {
            return null;
        }
        return product;
    }
    
    @Override
    public List<Product> getProducts() {
        final List productsOrdered = entityManager.createQuery("SELECT h FROM Product h ORDER BY h.id ASC").getResultList();
        return productsOrdered;
    }

    @Override
    public List<Product> getProductList() {
        final List<Product> productList = getProducts();
        return productList;
    }
}
