package sn.groupeisi.secureapp_app.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import sn.groupeisi.secureapp_app.entity.AccountUserEntity;
import sn.groupeisi.secureapp_app.repository.AccountUserRepository;
import sn.groupeisi.secureapp_app.service.AccountUserService;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountUserviceImpl implements AccountUserService {

    private AccountUserRepository accountUserRepository;

    @Override
    public List<AccountUserEntity> getUsers() {
        return accountUserRepository.findAll();
    }

    @Override
    public void addUser(AccountUserEntity accountUserEntity) {
        accountUserRepository.save(accountUserEntity);
    }

    @Override
    public AccountUserEntity getuser(Long id) {
        AccountUserEntity accountUserEntity = accountUserRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid accountUser id"+id));
        return accountUserEntity;
    }

    @Override
    public void updateUser(Long id, AccountUserEntity accountUserEntity) {
        // chech weather the accountUserEntity is in database or not
        accountUserRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid accountUser id"+id));
        accountUserEntity.setId(id);
        accountUserRepository.save(accountUserEntity);

    }

    @Override
    public void deleteUser(Long id) {
        // check weather the user is in database or not
        AccountUserEntity accountUserEntity = accountUserRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid accountUser id"+id));
        accountUserRepository.delete(accountUserEntity);


    }



  /*  @Override
    public void updateName(Long id, AccountUserDto accountUserDto) {

    }*/


}
