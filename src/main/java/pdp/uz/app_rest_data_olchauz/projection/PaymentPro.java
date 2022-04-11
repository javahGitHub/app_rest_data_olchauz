package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Payment;

@Projection(types = Payment.class)
public interface PaymentPro {
     int getId();

     String getCondition();

     String getCardName();
}
