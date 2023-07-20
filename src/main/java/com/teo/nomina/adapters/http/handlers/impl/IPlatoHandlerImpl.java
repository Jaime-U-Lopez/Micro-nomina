package com.teo.nomina.adapters.http.handlers.impl;

import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoHabilitacionRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PlatoRequestUpdateDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.response.PlatoResponseDto;
import com.pragma.plazoletamicroservicio.adapters.http.handlers.IPlatoHandler;
import com.pragma.plazoletamicroservicio.adapters.http.mapper.IPlatoRequestMapper;
import com.pragma.plazoletamicroservicio.adapters.http.mapper.IPlatoResponseMapper;
import com.pragma.plazoletamicroservicio.domain.api.IPlatoServicePort;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class IPlatoHandlerImpl implements IPlatoHandler {

    private final IPlatoResponseMapper platoResponseMapper;
    private final IPlatoServicePort platoServicePort;
    private final IPlatoRequestMapper platoRequestMapper;





    @Override
    public List<PlatoResponseDto> getAllPlatos() {

        return platoResponseMapper.toResponseList(platoServicePort.getAllPlato());

    }

    @Override
    public void savePlato(PlatoRequestDto platoRequestDto) {


        platoServicePort.savePlato(platoRequestMapper.toPlato(platoRequestDto));
    }

    @Override
    public void updatePlato(PlatoRequestUpdateDto platoRequestUpdateDto) {


        platoServicePort.updatePlato(platoRequestMapper.updatetoPlato(platoRequestUpdateDto));

    }

    @Override
    public void changeStatePlato(PlatoHabilitacionRequestDto platoHabilitacionRequestDto) {

        platoServicePort.changeStatePlato(platoRequestMapper.changeUpdateStatetoPlato(platoHabilitacionRequestDto));
    }

    @Override
    public void deletePlato(Long id) {
        platoServicePort.deletePlato(id);


    }

    @Override
    public List<PlatoResponseDto> getPlatoByRestaurante(String id, String categoria , Pageable pegeable) {

        return platoResponseMapper.toResponseList(platoServicePort.getPlatoByRestaurante( id,  categoria ,  pegeable));

    }

    @Override
    public PlatoResponseDto getPlato(Long id) {

        return platoResponseMapper.platoToPlatoResponse(platoServicePort.getPlato(id));

    }
}
