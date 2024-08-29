package sn.groupeisi.secureapp_app.mapper;

import org.mapstruct.Mapper;
import sn.groupeisi.secureapp_app.dto.AccountUserDto;
import sn.groupeisi.secureapp_app.entity.AccountUserEntity;

@Mapper
public interface AccountUserMapper {
    AccountUserEntity toAccountUserEntity(AccountUserDto accountUserDto);
    AccountUserDto toAccountUserDto(AccountUserEntity accountUserEntity);
}
