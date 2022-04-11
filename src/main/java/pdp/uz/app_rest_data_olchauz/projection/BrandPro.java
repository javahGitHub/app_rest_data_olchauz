package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Attachment;
import pdp.uz.app_rest_data_olchauz.entity.Brand;

import javax.persistence.OneToOne;

@Projection(types = Brand.class)
public interface BrandPro {
     int getId();

     String getName();

     Attachment getIcon();
}
