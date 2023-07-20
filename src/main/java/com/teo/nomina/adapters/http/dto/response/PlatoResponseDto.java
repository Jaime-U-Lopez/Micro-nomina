package com.teo.nomina.adapters.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PlatoResponseDto {

    private Long id;
    private String nombre;
    private Long precio;
    private String descripcion;
    private String urlImagen;
    private String categoria;
    private boolean estado= true;
}
