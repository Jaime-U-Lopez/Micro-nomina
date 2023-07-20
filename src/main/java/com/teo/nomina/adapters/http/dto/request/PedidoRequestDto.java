package com.teo.nomina.adapters.http.dto.request;

import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.entity.PlatoEntity;
import com.pragma.plazoletamicroservicio.domain.model.Plato;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PedidoRequestDto {


    private  String  clienteEmail ;
    private  Long  IdRestaurante ;
    private List<PlatoEntity> platos;

    private Map<Plato, Integer> cantidadPorPlato;

    @NotBlank
    private String estado= "pendiente";




}
