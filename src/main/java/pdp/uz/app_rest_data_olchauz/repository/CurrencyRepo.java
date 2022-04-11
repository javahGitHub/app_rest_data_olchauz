package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;
import pdp.uz.app_rest_data_olchauz.entity.Currency;
import pdp.uz.app_rest_data_olchauz.projection.CurrencyPro;

@RepositoryRestResource(path = "currency",excerptProjection = CurrencyPro.class)
public interface CurrencyRepo extends JpaRepository<Currency,Integer> {
}
