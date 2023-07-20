package com.teo.nomina.adapters.http.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlatoRequestDto {

    @NotBlank
    private String nombre;
    @Positive(message = "El precio  debe ser positivo y mayor a cero")
    private Long precio;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String urlImagen;
    @NotBlank
    private String categoria;






}
