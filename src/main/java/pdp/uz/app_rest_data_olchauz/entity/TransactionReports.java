package pdp.uz.app_rest_data_olchauz.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class TransactionReports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product product;

    @ManyToMany
    private List<Customer> customer;

    private int amount;

    @ManyToOne
    private Payment payment;

    private double totalAmount;

    private Date date;

}
