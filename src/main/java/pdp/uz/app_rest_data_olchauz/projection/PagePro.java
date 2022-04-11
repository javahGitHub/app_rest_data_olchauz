package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Page;

@Projection(types = Page.class)
public interface PagePro {
     int getId();

     String getName();

}
