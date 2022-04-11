package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Garbage;
import pdp.uz.app_rest_data_olchauz.projection.GarbagePro;

@RepositoryRestResource(path = "garbage",excerptProjection = GarbagePro.class)
public interface GarbageRepo extends JpaRepository<Garbage,Integer> {
}
