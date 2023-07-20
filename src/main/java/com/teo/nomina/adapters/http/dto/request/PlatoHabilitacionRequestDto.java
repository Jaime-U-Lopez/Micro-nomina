package com.teo.nomina.adapters.http.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlatoHabilitacionRequestDto {


    private Long id;
    @NotBlank
    private String estado;








}
