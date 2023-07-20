package com.teo.nomina.adapters.jpa.mysql.exceptions;

public class RestauranteYaExistenteException extends RuntimeException{

    public RestauranteYaExistenteException(String message) {
        super(message);
    }
}
