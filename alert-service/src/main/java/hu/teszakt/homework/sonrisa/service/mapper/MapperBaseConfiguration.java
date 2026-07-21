package hu.teszakt.homework.sonrisa.service.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL,
        nullValueIterableMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        nullValueMapMappingStrategy = NullValueMappingStrategy.RETURN_NULL
)
public interface MapperBaseConfiguration {
}
