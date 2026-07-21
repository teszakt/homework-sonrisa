package hu.teszakt.homework.sonrisa.service.mapper;

import hu.teszakt.homework.sonrisa.db.entity.AlertEntity;
import hu.teszakt.homework.sonrisa.model.AlertCreationRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring",
        config = MapperBaseConfiguration.class
)
public interface AlertMapper {

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "alertType", source = "alert.alertType")
    @Mapping(target = "criteria", source = "alert.criteria")
    @Mapping(target = "channels", source = "alert.channels")
//    @Mapping(target = "user")
    AlertEntity mapToAlertEntity(AlertCreationRequest request);

}
