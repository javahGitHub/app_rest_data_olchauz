package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Product;
import pdp.uz.app_rest_data_olchauz.projection.ProductPro;

@RepositoryRestResource(path = "product",excerptProjection = ProductPro.class)
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
