package com.teo.nomina.adapters.jpa.mysql.mapper;

import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.entity.PedidoEntity;
import com.pragma.plazoletamicroservicio.domain.model.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PedidoEntityMapper {
    Pedido pedidoEntityToPedido(PedidoEntity pedidoEntity);
   PedidoEntity pedidoToPedidoEntity(Pedido pedido);
    List<Pedido> toPedidoList(List<PedidoEntity> pedidoEntityList);
}
