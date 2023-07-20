package com.teo.nomina.adapters.http.exceptions;

public class UsuarioNoExiste extends RuntimeException {
    public UsuarioNoExiste(String message){
        super(message);
    }
}
