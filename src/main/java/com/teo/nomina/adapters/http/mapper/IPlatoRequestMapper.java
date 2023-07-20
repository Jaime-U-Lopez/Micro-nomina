package com.teo.nomina.adapters.http.mapper;


import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoHabilitacionRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoRequestUpdateDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.response.PlatoResponseDto;
import com.pragma.plazoletamicroservicio.domain.model.Plato;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlatoRequestMapper {

    Plato toPlato(PlatoRequestDto platoRequestDto);

    //@Mapping(target = "plato.id", source = "idplato")
    Plato updatetoPlato( PlatoRequestUpdateDto platoRequestUpdateDto);

    Plato changeUpdateStatetoPlato(PlatoHabilitacionRequestDto platoHabilitacionRequestDto);

    List<PlatoResponseDto> toResponseList(List<Plato> platoList);
}
