package com.teo.nomina.adapters.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioResponseDto {


    private String id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;
    private String idDniType;
    private String dniNumber;
    private String idPersonType;

    private String birthDate;
}
