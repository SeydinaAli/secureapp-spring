package sn.groupeisi.secureapp_app.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.groupeisi.secureapp_app.entity.AccountUserEntity;
import sn.groupeisi.secureapp_app.service.AccountUserService;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AccountUserController {

    private  AccountUserService accountUserService;

    @PostMapping("/add")
    public String addUser(@RequestBody AccountUserEntity accountUserEntity){
        accountUserService.addUser(accountUserEntity);

        return "compte add avec success";
    }

    @GetMapping()
    public List<AccountUserEntity> getUsers(){
        return  accountUserService.getUsers();
    }

    @GetMapping("/get")
    public AccountUserEntity getUser(@RequestParam Long id){
        return accountUserService.getuser(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Long id, @RequestBody AccountUserEntity accountUserEntity){
        accountUserService.updateUser(id,accountUserEntity);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        accountUserService.deleteUser(id);

        return ResponseEntity.noContent().build();
    }

/*    @PatchMapping("/update-name/{id}")
    public  ResponseEntity<void> updateName(@PathVariable Long id, @RequestBody AccountUserDTO accountUserDTO){
        accountUserService.updateName(id, accountUserDTO);
        return  ResponseEntity.noContent().build();
    }*/
}
