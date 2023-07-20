package com.teo.nomina.adapters.http.handlers;


import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoHabilitacionRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoRequestUpdateDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.response.PlatoResponseDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPlatoHandler {
    List<PlatoResponseDto> getAllPlatos();
    void savePlato(PlatoRequestDto platoRequestDto);
    void updatePlato(PlatoRequestUpdateDto platoRequestUpdateDto);
    void changeStatePlato(PlatoHabilitacionRequestDto platoHabilitacionRequestDto);

    void deletePlato(Long id);

    List<PlatoResponseDto> getPlatoByRestaurante(String id, String categoria , Pageable pegeable);
    PlatoResponseDto getPlato(Long id);

}
