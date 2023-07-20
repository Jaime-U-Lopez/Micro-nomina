package com.teo.nomina.adapters.jpa.mysql.mapper;

import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.entity.UsuarioAutenticadoEntity;
import com.pragma.plazoletamicroservicio.domain.model.UsuarioAutenticado;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UsuarioAutenticadoEntityMapper {
    UsuarioAutenticado usuarioAutenticadoEntityToUsuario(UsuarioAutenticadoEntity usuarioAutenticadoEntity);

    UsuarioAutenticadoEntity UsuarioAutenticaotoUsuarioEntity(UsuarioAutenticado usuarioAutenticado);

}
