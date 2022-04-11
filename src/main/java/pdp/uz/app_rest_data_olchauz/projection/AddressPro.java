package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Address;

@Projection(types = Address.class)
public interface AddressPro {
    int getId();

    String getCountry();
    String getState();
    String getDistrict();
    String getStreet();
    String getBuildingNumber();
}
