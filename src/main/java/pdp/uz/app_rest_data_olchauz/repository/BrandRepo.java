package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Brand;
import pdp.uz.app_rest_data_olchauz.projection.BrandPro;

@RepositoryRestResource(path = "brand",excerptProjection = BrandPro.class)
public interface BrandRepo extends JpaRepository<Brand,Integer> {
}
