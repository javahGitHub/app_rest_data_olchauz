package pdp.uz.app_rest_data_olchauz.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne
    private Attachment icon;
}
