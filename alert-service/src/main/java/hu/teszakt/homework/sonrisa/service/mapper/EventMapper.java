package hu.teszakt.homework.sonrisa.service.mapper;

import hu.teszakt.homework.sonrisa.db.entity.EventEntity;
import hu.teszakt.homework.sonrisa.model.EventCreationRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring",
        config = MapperBaseConfiguration.class
)
public interface EventMapper {

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "alertType", source = "event.alertType")
    @Mapping(target = "createdAt", source = "event.createdAt")
    @Mapping(target = "message", source = "event.message")
    EventEntity mapToEventEntity(EventCreationRequest request);

}
