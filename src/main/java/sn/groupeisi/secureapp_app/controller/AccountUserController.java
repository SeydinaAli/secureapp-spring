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


























/*    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person personDetails){
        Optional<Person> person = personRepository.findById(id);

        if(person.isPresent()){
            Person existingPerson = person.get();
            existingPerson.setCity(personDetails.getCity());
            existingPerson.setPhoneNumber(personDetails.getPhoneNumber());

            Person updatePerson =personRepository.save(existingPerson);
            return new ResponseEntity<>(updatedPerson, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }*/

    // CREER UN COMPTE USER
/*    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        Person personCreated = personRepository.save(person);
        return new ResponseEntity<>(personCreated, HttpStatus.CREATED)
    }*/

    // RECHERCHER PAR ID
/*    @GetMapping("/{id}")

    public ResponseEntity<Person>> getPersonById(@PathVariable Long id){
        Optional<Person> person = personRepository.findById(id);

        if(person.isPresent()){
            return new ResponseEntity<>(person.get(), HttpStatus.OK)
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }*/

    // TOUT AFFICHER

/*    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.Ok);

    }*/

    // SUPPRIMER PAR ID

/*    @DeleteMapping("/{id}")

    public ResponseEntity<Void> deletePerson(@PathVariable Long id){
        Optional<Person> person = personRepository.FindById(id);

        if (person.isPresent()){
            personRepository.delete(person.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }*/
}
