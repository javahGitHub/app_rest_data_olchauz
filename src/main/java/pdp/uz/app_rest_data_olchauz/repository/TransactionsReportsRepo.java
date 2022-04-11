package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.TransactionReports;
import pdp.uz.app_rest_data_olchauz.projection.TransactionReportsPro;

@RepositoryRestResource(path = "transactionsReports",excerptProjection = TransactionReportsPro.class)
public interface TransactionsReportsRepo extends JpaRepository<TransactionReports,Integer> {
}
