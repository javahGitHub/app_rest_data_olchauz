package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Customer;
import pdp.uz.app_rest_data_olchauz.projection.templete.IndividualPro;

@Projection(types = Customer.class)
public interface CustomerPro extends IndividualPro {

}
