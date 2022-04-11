package pdp.uz.app_rest_data_olchauz.entity.templete;

import lombok.Data;
import pdp.uz.app_rest_data_olchauz.entity.Address;

import javax.persistence.*;

@Data
@Entity
public class Individual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String email;

    @OneToOne
    private Address address;

    private String phoneNumber;

}
