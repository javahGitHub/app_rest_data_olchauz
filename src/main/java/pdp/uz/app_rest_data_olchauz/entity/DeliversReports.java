package pdp.uz.app_rest_data_olchauz.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class DeliversReports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private TransactionReports transactionReports;

    @ManyToOne
    private Deliver deliver;

    private Date date;

}
