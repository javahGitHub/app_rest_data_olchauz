package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Admin;
import pdp.uz.app_rest_data_olchauz.projection.templete.IndividualPro;

@Projection(types = Admin.class)
public interface AdminPro extends IndividualPro {

}
