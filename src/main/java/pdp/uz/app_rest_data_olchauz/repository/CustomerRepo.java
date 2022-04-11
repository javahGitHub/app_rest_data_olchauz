package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pdp.uz.app_rest_data_olchauz.entity.Customer;
import pdp.uz.app_rest_data_olchauz.projection.CustomerPro;

@RepositoryRestResource(path = "customer",excerptProjection = CustomerPro.class)
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}

