package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import pdp.uz.app_rest_data_olchauz.entity.Car;
import pdp.uz.app_rest_data_olchauz.projection.CarPro;

@RepositoryRestResource(path = "car",excerptProjection = CarPro.class)
public interface CarRepo extends JpaRepository<Car,Integer> {


}
