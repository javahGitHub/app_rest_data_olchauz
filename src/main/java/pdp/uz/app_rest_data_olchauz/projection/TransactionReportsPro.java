package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Customer;
import pdp.uz.app_rest_data_olchauz.entity.Payment;
import pdp.uz.app_rest_data_olchauz.entity.Product;
import pdp.uz.app_rest_data_olchauz.entity.TransactionReports;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Projection(types = TransactionReports.class)
public interface TransactionReportsPro {
     int getId();


     Product getProduct();


     List<Customer> getCustomer();

     int getAmount();


     Payment getPayment();

     double getTotalAmount();

     Date getDate();
}
