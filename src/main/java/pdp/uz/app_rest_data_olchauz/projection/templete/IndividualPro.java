package pdp.uz.app_rest_data_olchauz.projection.templete;


import pdp.uz.app_rest_data_olchauz.entity.Address;

import javax.persistence.*;

public interface IndividualPro {

    int getId();

    String getFirstName();

    String getLastName();

    String getUserName();

    String getPassword();

    String getEmail();


    Address getAddress();

     String getPhoneNumber();

}
