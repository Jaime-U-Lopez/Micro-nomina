package com.teo.nomina.configuration.FeignClient;

public class ExceptionUserRequest  extends RuntimeException{

    public ExceptionUserRequest( String message){
        super(message);
    }


}
