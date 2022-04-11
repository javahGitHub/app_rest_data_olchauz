package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyPro {
    int getId();

    String getName();

}
