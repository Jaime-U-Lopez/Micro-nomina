package com.teo.nomina.adapters.http.controller;

import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoHabilitacionRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoRequestUpdateDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.response.PlatoResponseDto;
import com.pragma.plazoletamicroservicio.adapters.http.handlers.IPlatoHandler;
import com.pragma.plazoletamicroservicio.configuration.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/plato/v1")

//@SecurityRequirement(name = "jwt")
public class PlatoRestController {



    private  IPlatoHandler platoHandler;
    @Autowired
    public PlatoRestController(IPlatoHandler platoHandler) {
        this.platoHandler = platoHandler;
    }

    @Operation(summary = "mostrar todos los platos ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "All Platos   returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = PlatoResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @GetMapping("/all_platos")
    public ResponseEntity<List<PlatoResponseDto>> getAllPlatos() {
        return ResponseEntity.ok(platoHandler.getAllPlatos());
    }



    @Operation(summary = "mostrar todos los platos por Restaurante ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "All Platos   returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = PlatoResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @GetMapping("/{idRestaurante}")
    public ResponseEntity<List<PlatoResponseDto>> getAllPlatosByRestaurante(@PathVariable("idRestaurante")   String idRestaurante,
                                                                            @RequestParam(defaultValue = "pollo") String categoria ,
                                                                            @RequestParam(defaultValue = "0") int pagina,
                                                                            @RequestParam(defaultValue = "10") int elementosPorPagina){

        Pageable pageable = PageRequest.of(pagina, elementosPorPagina);
        return ResponseEntity.ok(platoHandler.getPlatoByRestaurante(idRestaurante, categoria ,  pageable));
    }



    @Operation(summary = "Crear un plato ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Message  returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = PlatoRequestDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @PostMapping("/")
    public ResponseEntity<Map<String, String>>  createPlato(@Valid @RequestBody PlatoRequestDto requestDto ) {

       platoHandler.savePlato(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.PLATO_CREADO_MENSAJE)
        );
    }

    @Operation(summary = "Cambiar el estado de un plato ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Message  returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = PlatoRequestDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @PostMapping("/estado")
    public ResponseEntity<Map<String, String>>  habilitarODesabilitarPlatos(@Valid @RequestBody PlatoHabilitacionRequestDto platoHabilitacionRequestDto ) {

        platoHandler.changeStatePlato(platoHabilitacionRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.PLATO_CREADO_MENSAJE)
        );
    }


    @Operation(summary = "Update un plato ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "All roles returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = PlatoRequestUpdateDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})

    @PutMapping("/")
    public ResponseEntity<Map<String, String>>  updatePlato(@Valid @RequestBody PlatoRequestUpdateDto platoRequestUpdateDto ) {


        platoHandler.updatePlato(platoRequestUpdateDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.PLATO_CREADO_MENSAJE)
        );
    }




    @Operation(summary = "Elimine un rol ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Role deleted",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "404", description = "User not found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deletePlato(@PathVariable("id") Long id ) {
       platoHandler.deletePlato(id);
        return ResponseEntity.ok(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.PLATO_ELIMINADO));
    }



}
