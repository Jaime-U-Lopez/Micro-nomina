package com.teo.nomina.adapters.jpa.mysql.repository;

import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.entity.PlatoEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IPlatoRepository extends JpaRepository<PlatoEntity ,Long> {

    Optional<List<PlatoEntity>> findPlatoEntityByRestauranteEntityId(String id);
    Optional<List<PlatoEntity>> findPlatoEntityByCategoriaAndRestauranteEntityId(String categoria, String id , Pageable pageable );
}
