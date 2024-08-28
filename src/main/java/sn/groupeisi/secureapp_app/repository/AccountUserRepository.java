package sn.groupeisi.secureapp_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.secureapp_app.entity.AccountUserEntity;

public interface AccountUserRepository extends JpaRepository<Long, AccountUserEntity> {
}
