package com.teo.nomina.domain.model;

import java.sql.Date;

public class PeriodosLiquidacion {

    private Integer codigo;

    private Date  fechaInicio;
    private Date  fechaFin;

   private  EstadoLiquidacionNovedades estadoLiquidacionNovedades;


    public PeriodosLiquidacion(Integer codigo, Date fechaInicio, Date fechaFin, EstadoLiquidacionNovedades estadoLiquidacionNovedades) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoLiquidacionNovedades = estadoLiquidacionNovedades;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public EstadoLiquidacionNovedades getEstadoLiquidacionNovedades() {
        return estadoLiquidacionNovedades;
    }

    public void setEstadoLiquidacionNovedades(EstadoLiquidacionNovedades estadoLiquidacionNovedades) {
        this.estadoLiquidacionNovedades = estadoLiquidacionNovedades;
    }
}
