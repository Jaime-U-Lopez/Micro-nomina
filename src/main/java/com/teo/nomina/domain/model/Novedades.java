package com.teo.nomina.domain.model;

import java.sql.Date;

public class Novedades {

    private Integer codigo;
    private Colaborador colaborador;
    private Concepto concepto;
    private  TipoNovedad tipoNovedad;
    private PeriodosLiquidacion periodoLiquidacion;








    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Concepto getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }

    public TipoNovedad getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(TipoNovedad tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }
}
