package sn.groupeisi.secureapp_app.service;


import sn.groupeisi.secureapp_app.entity.AccountUserEntity;

import java.util.List;

public interface AccountUserService {
    List<AccountUserEntity> getUsers();

    void addUser(AccountUserEntity accountUserEntity);

    AccountUserEntity getuser(Long id);

    void updateUser(Long id, AccountUserEntity accountUserEntity);

    void deleteUser(Long id);

//    void updateName(Long id, AccountUserDTO accountUserDTO);
}
