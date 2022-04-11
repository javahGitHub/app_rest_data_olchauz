package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Deliver;
import pdp.uz.app_rest_data_olchauz.entity.DeliversReports;
import pdp.uz.app_rest_data_olchauz.entity.TransactionReports;
import pdp.uz.app_rest_data_olchauz.repository.DeliversReportsRepo;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Projection(types = DeliversReports.class)
public interface DeliversReportsPro {
     int getId();
     TransactionReports getTransactionReports();

     Deliver getDeliver();

    Date getDate();
}
