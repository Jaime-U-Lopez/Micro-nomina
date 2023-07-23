package com.teo.nomina.domain.model;

import java.sql.Date;

public class Deducible {

    private Integer codigo;
    private Integer valor;
    private TipoDeducible tipoDeducible;
    private Beneficiario beneficiarioDependientes;
    private Date fechaInicio;
    private Date fechaFin;


    public Deducible(Integer codigo, Integer valor, TipoDeducible tipoDeducible, Beneficiario beneficiarioDependientes, Date fechaInicio, Date fechaFin) {
        this.codigo = codigo;
        this.valor = valor;
        this.tipoDeducible = tipoDeducible;
        this.beneficiarioDependientes = beneficiarioDependientes;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public TipoDeducible getTipoDeducible() {
        return tipoDeducible;
    }

    public void setTipoDeducible(TipoDeducible tipoDeducible) {
        this.tipoDeducible = tipoDeducible;
    }

    public Beneficiario getBeneficiarioDependientes() {
        return beneficiarioDependientes;
    }

    public void setBeneficiarioDependientes(Beneficiario beneficiarioDependientes) {
        this.beneficiarioDependientes = beneficiarioDependientes;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
