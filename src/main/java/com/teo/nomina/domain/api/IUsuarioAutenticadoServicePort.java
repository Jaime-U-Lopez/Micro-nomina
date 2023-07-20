package com.teo.nomina.domain.api;

import com.pragma.plazoletamicroservicio.domain.model.UsuarioAutenticado;

public interface IUsuarioAutenticadoServicePort {

    void saveUser(UsuarioAutenticado usuarioAutenticado);

    void deleteUser(Long id );

    UsuarioAutenticado getUser(Long id);




}
