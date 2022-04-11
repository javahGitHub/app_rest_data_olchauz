package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.*;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Projection(types = Product.class)
public interface ProductPro {
    int getId();

    String getName();


    Category getCategory();

    String getProperty();


    Brand getBrand();


    List<Attachment> getImage();

    double getPrice();


    Currency getCurrency();

    int getWarranty();//in month

    String getCode();

    boolean getAvailable();
}
