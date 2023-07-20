package com.teo.nomina.adapters.http.handlers.impl;

import com.pragma.plazoletamicroservicio.adapters.http.dto.request.PedidoRequestDto;
import com.pragma.plazoletamicroservicio.adapters.http.dto.response.PedidoResponseDto;
import com.pragma.plazoletamicroservicio.adapters.http.handlers.IPedidoHandler;
import com.pragma.plazoletamicroservicio.adapters.http.mapper.IPedidoRequestMapper;
import com.pragma.plazoletamicroservicio.adapters.http.mapper.IPedidoResponseMapper;
import com.pragma.plazoletamicroservicio.domain.api.IPedidoServicePort;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class IPedidoHandlerImpl implements IPedidoHandler {

    private final IPedidoServicePort pedidoServicePort;
    private final IPedidoRequestMapper pedidoRequestMapper;
    private final IPedidoResponseMapper  pedidoResponseMapper;


    @Override
    public void savePedido(PedidoRequestDto pedidoRequestDto) {

        this.pedidoServicePort.savePedido(pedidoRequestMapper.toPedido(pedidoRequestDto));

    }

    @Override
    public void deletePedido(Long id) {

        pedidoServicePort.deletePedido(id);

    }

    @Override
    public List<PedidoResponseDto> getAllPedidos() {

        return pedidoResponseMapper.toResponseList(this.pedidoServicePort.getAllPedido());

    }

    @Override
    public PedidoResponseDto getPedido(Long id) {

       return pedidoResponseMapper.toPedidoDTO(pedidoServicePort.getPedido(id));

    }


}
