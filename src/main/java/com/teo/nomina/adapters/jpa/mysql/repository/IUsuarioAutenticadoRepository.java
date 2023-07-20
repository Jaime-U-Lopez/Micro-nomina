package com.teo.nomina.adapters.jpa.mysql.repository;

import com.pragma.plazoletamicroservicio.adapters.jpa.mysql.entity.UsuarioAutenticadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioAutenticadoRepository extends JpaRepository<UsuarioAutenticadoEntity,Long> {

/*
    Optional<RestauranteEntity> findRestauranteEntityByNumeroDocumento(String id);


 */

}
