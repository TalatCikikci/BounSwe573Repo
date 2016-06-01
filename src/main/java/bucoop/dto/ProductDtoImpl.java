package bucoop.dto;

import bucoop.model.Product;
import bucoop.model.Productall;
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
    
    @Override
    public Productall getAllProductInfo(Integer productId){
        final Productall productAll = entityManager.find(Productall.class, productId);
        if (productAll == null){
            return null;
        }
        
        return productAll;
    }
    
    @Override
    public List<Productall> getProductalls() {
        final List productallsOrdered = entityManager.createQuery("SELECT h FROM Productall h ORDER BY h.id DESC").getResultList();
        return productallsOrdered;
    }
    
    @Override
    public List<Productall> getProductallList() {
        final List<Productall> producerallList = getProductalls();
        return producerallList;
    }
    
    @Override
    @Transactional
    public Productall getAllProductInfoByProductid(Integer productId){
        final Productall productInfo = (Productall) entityManager.createQuery("SELECT h FROM Productall h WHERE h.id = :productid").setParameter("productid", productId).getSingleResult();
        return productInfo;
    }
    
    @Override
    @Transactional
    public List<Productall> getAllProductInfoByProductname(String productName){
        final List<Productall> productInfo = entityManager.createQuery("SELECT h FROM Productall h WHERE h.productname LIKE :productname").setParameter("productname", "%" + productName + "%").getResultList();
        return productInfo;
    }
    
    @Override
    @Transactional
    public List<Productall> getAllProductInfoByProductdesc(String productDesc){
        final List<Productall> productInfo = entityManager.createQuery("SELECT h FROM Productall h WHERE h.productdesc LIKE :productdesc").setParameter("productdesc", "%" + productDesc + "%").getResultList();
        return productInfo;
    }
    
    @Override
    @Transactional
    public List<Productall> getAllProductInfoByProductactive(Boolean productActive){
        final List<Productall> productInfo = entityManager.createQuery("SELECT h FROM Productall h WHERE h.productactive LIKE :productactive").setParameter("productactive", "%" + productActive + "%").getResultList();
        return productInfo;
    }
    
    @Override
    @Transactional
    public List<Productall> getAllProductInfoByCategoryname(String categoryName){
        final List<Productall> productInfo = entityManager.createQuery("SELECT h FROM Productall h WHERE h.categoryname = :categoryname").setParameter("categoryname", "%" + categoryName + "%").getResultList();
        return productInfo;
    }
    
    @Override
    @Transactional
    public List<Productall> getAllProductInfoByProducername(String producerName){
        final List<Productall> productInfo = entityManager.createQuery("SELECT h FROM Productall h WHERE h.producername = :producername").setParameter("producername", "%" + producerName + "%").getResultList();
        return productInfo;
    }
    
    @Override
    @Transactional
    public List<Productall> getAllProductInfoByProducerdesc(String producerDesc){
        final List<Productall> productInfo = entityManager.createQuery("SELECT h FROM Productall h WHERE h.producerdesc = :producerdesc").setParameter("producerdesc", "%" + producerDesc + "%").getResultList();
        return productInfo;
    }
    
    @Override
    @Transactional
    public List<Productall> getAllProductInfoByProduceractive(Boolean producerActive){
        final List<Productall> productInfo = entityManager.createQuery("SELECT h FROM Productall h WHERE h.produceractive = :produceractive").setParameter("produceractive", "%" + producerActive + "%").getResultList();
        return productInfo;
    }
}
