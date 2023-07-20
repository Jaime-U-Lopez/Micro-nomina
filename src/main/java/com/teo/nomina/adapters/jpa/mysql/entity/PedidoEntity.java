package com.teo.nomina.adapters.jpa.mysql.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_restaurante")
    private RestauranteEntity restauranteEntity;

    //@ManyToOne
    //@JoinColumn(name = "id_plato")
   // private PlatoEntity platoEntity;

    private String estado;

    @ManyToMany
    private List<PlatoEntity> platos;

    @ElementCollection
    private Map<PlatoEntity, Integer> cantidadPorPlato;






}
