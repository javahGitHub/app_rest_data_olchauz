package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Page;
import pdp.uz.app_rest_data_olchauz.projection.PagePro;

@RepositoryRestResource(path = "page",excerptProjection = PagePro.class)
public interface PageRepo extends JpaRepository<Page,Integer> {
}
