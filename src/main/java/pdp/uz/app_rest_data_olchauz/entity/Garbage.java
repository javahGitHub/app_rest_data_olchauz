package pdp.uz.app_rest_data_olchauz.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Garbage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    private List<Product> product;

    @ManyToMany
    private List<Customer> customer;

}
