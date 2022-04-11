package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.ChatReports;
import pdp.uz.app_rest_data_olchauz.projection.ChatReportsPro;

@RepositoryRestResource(path = "chatReports",excerptProjection = ChatReportsPro.class)
public interface ChatReportsRepo extends JpaRepository<ChatReports,Integer> {
}
