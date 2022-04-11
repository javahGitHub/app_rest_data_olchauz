package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Customer;
import pdp.uz.app_rest_data_olchauz.entity.Garbage;
import pdp.uz.app_rest_data_olchauz.entity.Product;

import javax.persistence.ManyToMany;
import java.util.List;

@Projection(types = Garbage.class)
public interface GarbagePro {
    int getId();


     List<Product> getProduct();


     List<Customer> getCustomer();

}
