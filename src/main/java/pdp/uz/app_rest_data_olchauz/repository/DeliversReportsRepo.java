package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.DeliversReports;
import pdp.uz.app_rest_data_olchauz.projection.DeliversReportsPro;

@RepositoryRestResource(path = "deliverReportsRepo",excerptProjection = DeliversReportsPro.class)
public interface DeliversReportsRepo extends JpaRepository<DeliversReports,Integer> {
}
