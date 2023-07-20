package com.teo.nomina.adapters.jpa.mysql.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioAutenticadoEntity {

    @Id
    private Long id;
    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;






}
