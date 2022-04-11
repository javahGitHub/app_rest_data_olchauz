package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Review;
import pdp.uz.app_rest_data_olchauz.projection.ReviewPro;

@RepositoryRestResource(path = "review",excerptProjection = ReviewPro.class)
public interface ReviewRepo extends JpaRepository<Review,Integer> {
}
