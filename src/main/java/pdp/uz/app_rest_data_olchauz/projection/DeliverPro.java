package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Car;
import pdp.uz.app_rest_data_olchauz.entity.Deliver;
import pdp.uz.app_rest_data_olchauz.projection.templete.IndividualPro;

@Projection(types = Deliver.class)
public interface DeliverPro extends IndividualPro {
    Car getCar();
}
