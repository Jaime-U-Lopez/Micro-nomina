package com.teo.nomina.adapters.http.handlers.impl;

import com.pragma.plazoletamicroservicio.adapters.http.dto.request.UsuarioAutenticadoRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.handlers.IUsuarioAutenticadoHandler;
import com.pragma.plazoletamicroservicio.adapters.http.mapper.IUsuarioAutenticadoRequestMapper;
import com.pragma.plazoletamicroservicio.domain.api.IUsuarioAutenticadoServicePort;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data
public class IUsuarioAutenticadoHandlerImpl implements IUsuarioAutenticadoHandler {

    private final IUsuarioAutenticadoServicePort usuarioAutenticadoServicePort;
    private final IUsuarioAutenticadoRequestMapper usuarioAutenticadoRequestMapper;



    @Override
    public void saveUser(UsuarioAutenticadoRequestDto usuarioAutenticadoRequestDto) {

        usuarioAutenticadoServicePort.saveUser(usuarioAutenticadoRequestMapper.toUsuarioAutenticado(usuarioAutenticadoRequestDto));

    }

    @Override
    public void deleteUser(Long id) {

        usuarioAutenticadoServicePort.deleteUser(id);

    }
}
