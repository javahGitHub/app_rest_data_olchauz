package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Admin;
import pdp.uz.app_rest_data_olchauz.projection.AdminPro;

@RepositoryRestResource(path = "admin",excerptProjection = AdminPro.class)
public interface AdminRepo extends JpaRepository<Admin,Integer> {
}
