package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Category;
import pdp.uz.app_rest_data_olchauz.projection.CategoryPro;

@RepositoryRestResource(path = "category",excerptProjection = CategoryPro.class)
public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
