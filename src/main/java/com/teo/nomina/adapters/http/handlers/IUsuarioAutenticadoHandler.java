package com.teo.nomina.adapters.http.handlers;

import com.pragma.plazoletamicroservicio.adapters.http.dto.request.UsuarioAutenticadoRequestDto;

public interface IUsuarioAutenticadoHandler {

    void saveUser(UsuarioAutenticadoRequestDto usuarioAutenticadoRequestDto);

    void deleteUser(Long id );






}
