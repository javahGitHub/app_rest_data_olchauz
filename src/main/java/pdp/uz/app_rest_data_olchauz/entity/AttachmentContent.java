package pdp.uz.app_rest_data_olchauz.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AttachmentContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private byte[] mainBytes;

    @OneToOne
    private Attachment attachment;
}
