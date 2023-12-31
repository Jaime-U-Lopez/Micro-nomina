package com.teo.nomina.configuration;

import com.pragma.plazoletamicroservicio.adapters.http.exceptions.*;
import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.exceptions.PlatoException;
import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.exceptions.RestauranteYaExistenteException;
import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.exceptions.UsuarioYaExistenteException;
import com.pragma.plazoletamicroservicio.configuration.FeignClient.ExceptionUserRequest;
import feign.FeignException;
import jakarta.persistence.NonUniqueResultException;
import org.hibernate.id.IdentifierGenerationException;
import org.mapstruct.ap.shaded.freemarker.template.utility.NullArgumentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.management.relation.RoleInfoNotFoundException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value={CorreoMalFormuladoException.class,
            DocumentoMalFormuladoException.class,
            CelularMalFormuladoException.class,
            FechaNacimientoMalFormatoException.class,
            NoEsMayorDeEdadException.class,
            RolNoExiste.class,
            RolNoExisteTipoRol.class,
            RolExisteEnBaseDatos.class,
            RoleInfoNotFoundException.class,
            UsuarioYaExistenteException.class,
            PlatoException.class,
            ExceptionUserRequest.class,
            NullPointerException.class,
            NullArgumentException.class,
            IdentifierGenerationException.class,
            PlatoNoExiste.class,
            NonUniqueResultException.class,
            FeignException.Unauthorized.class,
            FeignException.NotFound.class,
            RestauranteYaExistenteException.class,

            UsuarioNoSeEncuentraRegistradoException.class
    })

    public ResponseEntity<Object> BadRequestExceptionHandler(RuntimeException ex){
        ApiException apiException = new ApiException(
                ex.getMessage(),
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value ={MethodArgumentNotValidException.class,

            RestauranteYaExistenteException.class,
            UsuarioNoSeEncuentraRegistradoException.class})
    public ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException ex) {
        List<String> errorMessages = new ArrayList<>();
        for (ObjectError error : ex.getBindingResult().getAllErrors()) {
            if (error instanceof FieldError) {
                FieldError fieldError = (FieldError) error;
                errorMessages.add(fieldError.getField() + ": " + fieldError.getDefaultMessage());
            } else {
                errorMessages.add(error.getDefaultMessage());
            }
        }
        return new ResponseEntity<>(errorMessages, HttpStatus.BAD_REQUEST);
    }

}
