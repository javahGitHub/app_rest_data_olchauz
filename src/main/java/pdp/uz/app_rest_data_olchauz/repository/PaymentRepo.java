package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Payment;
import pdp.uz.app_rest_data_olchauz.projection.PaymentPro;

import javax.persistence.criteria.CriteriaBuilder;

@RepositoryRestResource(path = "payment",excerptProjection = PaymentPro.class)
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
}
