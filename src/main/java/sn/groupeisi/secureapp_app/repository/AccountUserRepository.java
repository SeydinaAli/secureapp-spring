package sn.groupeisi.secureapp_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.secureapp_app.entity.AccountUserEntity;

import java.util.Optional;

public interface AccountUserRepository extends JpaRepository<AccountUserEntity, Long> {
    Optional<AccountUserEntity> findByEmail(String email);
}
