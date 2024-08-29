package sn.groupeisi.secureapp_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountUserDto {

    private  Long id;
    private  String email;
    private  Boolean state;


}
