package com.teo.nomina.domain.usecase;

import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.mapper.UsuarioAutenticadoEntityMapper;
import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.repository.IUsuarioAutenticadoRepository;
import com.pragma.plazoletamicroservicio.domain.api.IUsuarioAutenticadoServicePort;
import com.pragma.plazoletamicroservicio.domain.model.UsuarioAutenticado;
import com.pragma.plazoletamicroservicio.domain.spi.IUsuarioAutenticadoPersistenciaPort;

public class UsuarioAutenticadoUseCase implements IUsuarioAutenticadoServicePort {

    private final IUsuarioAutenticadoRepository usuarioAutenticadoRepository ;
    private final UsuarioAutenticadoEntityMapper  usuarioAutenticadoEntityMapper;
    private final IUsuarioAutenticadoPersistenciaPort  usuarioAutenticadoPersistenciaPort;



    public UsuarioAutenticadoUseCase(IUsuarioAutenticadoRepository usuarioAutenticadoRepository, UsuarioAutenticadoEntityMapper usuarioAutenticadoEntityMapper, IUsuarioAutenticadoPersistenciaPort usuarioAutenticadoPersistenciaPort) {
        this.usuarioAutenticadoRepository = usuarioAutenticadoRepository;
        this.usuarioAutenticadoEntityMapper = usuarioAutenticadoEntityMapper;
        this.usuarioAutenticadoPersistenciaPort = usuarioAutenticadoPersistenciaPort;
    }


    @Override
    public void saveUser(UsuarioAutenticado usuarioAutenticado) {

        usuarioAutenticadoPersistenciaPort.saveUser(usuarioAutenticado);
    }

    @Override
    public void deleteUser(Long id) {
        usuarioAutenticadoPersistenciaPort.deleteUser(id);
    }

    @Override
    public UsuarioAutenticado getUser(Long id) {

        return usuarioAutenticadoPersistenciaPort.getUser(id);
    }
}
