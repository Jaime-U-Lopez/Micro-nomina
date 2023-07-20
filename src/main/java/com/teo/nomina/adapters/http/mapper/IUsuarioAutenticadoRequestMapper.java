package com.teo.nomina.adapters.http.mapper;

import com.pragma.plazoletamicroservicio.adapters.http.dto.request.UsuarioAutenticadoRequestDto;
import com.pragma.plazoletamicroservicio.domain.model.UsuarioAutenticado;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
unmappedTargetPolicy = ReportingPolicy.IGNORE,
unmappedSourcePolicy =  ReportingPolicy.IGNORE)
public interface IUsuarioAutenticadoRequestMapper {

 //   @Mapping(target = "authorities", source = "authorities")
    UsuarioAutenticado toUsuarioAutenticado(UsuarioAutenticadoRequestDto usuarioAutenticadoRequestDto);

}
