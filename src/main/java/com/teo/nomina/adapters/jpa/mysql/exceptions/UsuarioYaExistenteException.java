package com.teo.nomina.adapters.jpa.mysql.exceptions;

public class UsuarioYaExistenteException extends RuntimeException{

    public UsuarioYaExistenteException(String message) {
        super(message);
    }
}
