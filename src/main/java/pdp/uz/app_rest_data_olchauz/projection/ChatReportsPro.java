package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Admin;
import pdp.uz.app_rest_data_olchauz.entity.ChatReports;
import pdp.uz.app_rest_data_olchauz.entity.Customer;

import javax.persistence.ManyToOne;
import java.util.Date;

@Projection(types = ChatReports.class)
public interface ChatReportsPro {
    int getId();

     Customer getCustomer();

    Admin getAdmin();

     String getMessage();

    Date gtDate();

     String getFrom();
}
