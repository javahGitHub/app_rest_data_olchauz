package pdp.uz.app_rest_data_olchauz.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    private Category category;

    private String property;

    @ManyToOne
    private Brand brand;

    @ManyToMany
    private List<Attachment> image;

    private double price;

    @ManyToOne
    private Currency currency;

    private int warranty;//in month

    private String code;

    private boolean available;

}
