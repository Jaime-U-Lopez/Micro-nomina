package com.teo.nomina.domain.spi;

import com.pragma.plazoletamicroservicio.domain.model.UsuarioAutenticado;

public interface IUsuarioAutenticadoPersistenciaPort {


    void saveUser(UsuarioAutenticado usuarioAutenticado);

    void deleteUser(Long id );

    UsuarioAutenticado getUser(Long id);

}
