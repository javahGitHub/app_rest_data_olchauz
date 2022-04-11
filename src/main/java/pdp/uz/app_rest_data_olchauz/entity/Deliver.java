package pdp.uz.app_rest_data_olchauz.entity;


import lombok.Data;
import pdp.uz.app_rest_data_olchauz.entity.templete.Individual;

import javax.persistence.*;

@Data
@Entity
public class Deliver extends Individual {

    @OneToOne
    private Car car;

}
