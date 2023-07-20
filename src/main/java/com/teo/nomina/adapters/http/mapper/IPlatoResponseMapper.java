package com.teo.nomina.adapters.http.mapper;

import com.pragma.plazoletamicroservicio.adapters.http.dto.response.PlatoResponseDto;
import com.pragma.plazoletamicroservicio.domain.model.Plato;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlatoResponseMapper {

   // @Mapping(target = "idRestaurante", source ="restaurante.id" )
    PlatoResponseDto platoToPlatoResponse(Plato plato);

    @Mapping(target = "idRestaurante", source ="restaurante.id" )
    List<PlatoResponseDto> toResponseList(List<Plato> platoList);

}
