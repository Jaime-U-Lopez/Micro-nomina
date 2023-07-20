package com.teo.nomina.adapters.jpa.mysql.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "plato")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlatoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Long precio;
    private String descripcion;
    private String urlImagen;
    private String categoria;



    @ManyToOne
    private RestauranteEntity restauranteEntity;

    private boolean estado= true;



}
