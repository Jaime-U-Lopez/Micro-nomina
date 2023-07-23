package com.teo.nomina.domain.model;

public class CentroCostos {

    private  String nombre;
    private String division;
    private String area;
    private String subArea;

    private String elementoPep;

    private String informacionAdicional;

    private Integer porcentage;

    public CentroCostos(String nombre, String division, String area, String subArea, String elementoPep, String informacionAdicional, Integer porcentage) {
        this.nombre = nombre;
        this.division = division;
        this.area = area;
        this.subArea = subArea;
        this.elementoPep = elementoPep;
        this.informacionAdicional = informacionAdicional;
        this.porcentage = porcentage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSubArea() {
        return subArea;
    }

    public void setSubArea(String subArea) {
        this.subArea = subArea;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    public Integer getPorcentage() {
        return porcentage;
    }

    public void setPorcentage(Integer porcentage) {
        this.porcentage = porcentage;
    }

    public String getElementoPep() {
        return elementoPep;
    }

    public void setElementoPep(String elementoPep) {
        this.elementoPep = elementoPep;
    }
}
