package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Address;
import pdp.uz.app_rest_data_olchauz.projection.AddressPro;

@RepositoryRestResource(path = "address",excerptProjection = AddressPro.class)
public interface AddressRepo extends JpaRepository<Address,Integer> {
}
