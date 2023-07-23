package com.teo.nomina.domain.model;

import java.sql.Date;

public class Concepto {

    private Integer codigo;
    private String nombreConcepto;
    private long valor;
    private Date fechaInicial;
    private Date fechaFin;

    private NaturalezaConcepto naturalezaConcepto;
    private TipoConceptoPrestacional tipoConceptoPrestacional;

    public Concepto(Integer codigo, String nombreConcepto, long valor, Date fechaInicial, Date fechaFin, NaturalezaConcepto naturalezaConcepto, TipoConceptoPrestacional tipoConceptoPrestacional) {
        this.codigo = codigo;
        this.nombreConcepto = nombreConcepto;
        this.valor = valor;
        this.fechaInicial = fechaInicial;
        this.fechaFin = fechaFin;
        this.naturalezaConcepto = naturalezaConcepto;
        this.tipoConceptoPrestacional = tipoConceptoPrestacional;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public NaturalezaConcepto getNaturalezaConcepto() {
        return naturalezaConcepto;
    }

    public void setNaturalezaConcepto(NaturalezaConcepto naturalezaConcepto) {
        this.naturalezaConcepto = naturalezaConcepto;
    }

    public TipoConceptoPrestacional getTipoConceptoPrestacional() {
        return tipoConceptoPrestacional;
    }

    public void setTipoConceptoPrestacional(TipoConceptoPrestacional tipoConceptoPrestacional) {
        this.tipoConceptoPrestacional = tipoConceptoPrestacional;
    }
}
