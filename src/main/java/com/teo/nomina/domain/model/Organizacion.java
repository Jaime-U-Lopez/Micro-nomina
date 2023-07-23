package com.teo.nomina.domain.model;

public class Organizacion {

    private Integer codigo;
    private String razonSocial;
    private String nombreComercial;
    private Long nit;
    private String telefono;
    private String contacto;
    private String direccion;
    private String representanteLegal;

    public Organizacion(Integer codigo, String razonSocial, String nombreComercial, Long nit, String telefono, String contacto, String direccion, String representanteLegal) {
        this.codigo = codigo;
        this.razonSocial = razonSocial;
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.telefono = telefono;
        this.contacto = contacto;
        this.direccion = direccion;
        this.representanteLegal = representanteLegal;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }
}
