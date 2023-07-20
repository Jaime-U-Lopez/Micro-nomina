package com.teo.nomina.domain.spi;

import com.pragma.plazoletamicroservicio.domain.model.Pedido;

import java.util.List;

public interface IPedidoPersistenciaPort {

    void savePedido(Pedido pedido);

    void updatePedido(Pedido pedido);

    void deletePedido(Long id);

    Pedido getPedido(Long id);

    List<Pedido> getAllPedido();



}
