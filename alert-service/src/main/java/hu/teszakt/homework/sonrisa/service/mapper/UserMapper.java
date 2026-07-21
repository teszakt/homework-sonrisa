package hu.teszakt.homework.sonrisa.service.mapper;

import hu.teszakt.homework.sonrisa.db.entity.UserEntity;
import hu.teszakt.homework.sonrisa.model.UserCreationRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring",
        config = MapperBaseConfiguration.class
)
public interface UserMapper {

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "email", source = "user.email")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "slack", source = "user.slack")
    UserEntity mapToUserEntity(UserCreationRequest request);

}
