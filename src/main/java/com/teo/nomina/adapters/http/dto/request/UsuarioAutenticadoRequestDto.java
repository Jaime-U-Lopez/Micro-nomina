package com.teo.nomina.adapters.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioAutenticadoRequestDto {

    private Long id;
    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;




}
