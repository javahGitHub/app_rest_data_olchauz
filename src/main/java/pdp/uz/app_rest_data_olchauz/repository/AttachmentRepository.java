package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.app_rest_data_olchauz.entity.Attachment;


public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
