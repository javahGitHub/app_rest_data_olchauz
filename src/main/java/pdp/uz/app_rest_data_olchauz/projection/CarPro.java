package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Car;

@Projection(types = Car.class)
public interface CarPro {
     int getId();

    String getModel();
    String getName();
    boolean isPrivate();
}
