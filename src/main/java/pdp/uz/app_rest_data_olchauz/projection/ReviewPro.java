package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Customer;
import pdp.uz.app_rest_data_olchauz.entity.Review;

import javax.persistence.ManyToMany;
import java.util.List;

@Projection(types = Review.class)
public interface ReviewPro {
    int getId();

    List<Customer> getCustomer();

    String getComment();
}
