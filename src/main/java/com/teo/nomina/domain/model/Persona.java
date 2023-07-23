package com.teo.nomina.domain.model;

import java.sql.Date;

public class Persona {
   private Integer codigo;
    private String nombre;
    private String apellido;
    private char tipoSangre;
    private Long  numerId;
    private Date fechaNacimiento;
    private String departamento;
    private String municipio;
    private String nacionalidad;
    private Date FechaExpedicionId;
    private String LugarExpedicion;
    private String personaDeContacto;
    private String email;


    public Persona(Integer codigo, String nombre, String apellido, char tipoSangre, Long numerId, Date fechaNacimiento, String departamento, String municipio, String nacionalidad, Date fechaExpedicionId, String lugarExpedicion, String personaDeContacto, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoSangre = tipoSangre;
        this.numerId = numerId;
        this.fechaNacimiento = fechaNacimiento;
        this.departamento = departamento;
        this.municipio = municipio;
        this.nacionalidad = nacionalidad;
        FechaExpedicionId = fechaExpedicionId;
        LugarExpedicion = lugarExpedicion;
        this.personaDeContacto = personaDeContacto;
        this.email = email;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(char tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Long getNumerId() {
        return numerId;
    }

    public void setNumerId(Long numerId) {
        this.numerId = numerId;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaExpedicionId() {
        return FechaExpedicionId;
    }

    public void setFechaExpedicionId(Date fechaExpedicionId) {
        FechaExpedicionId = fechaExpedicionId;
    }

    public String getLugarExpedicion() {
        return LugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        LugarExpedicion = lugarExpedicion;
    }

    public String getPersonaDeContacto() {
        return personaDeContacto;
    }

    public void setPersonaDeContacto(String personaDeContacto) {
        this.personaDeContacto = personaDeContacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
