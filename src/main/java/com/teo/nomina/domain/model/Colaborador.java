package com.teo.nomina.domain.model;

public class Colaborador {

    private Integer codigo;
    private Integer salario;
    private Persona persona;
    private  TipoContrato tipoContrato;
    private TipoSalario tipoSalario;
    private Integer  procesoDeRetencion;
    private String salud;
    private String pension;
    private String arl;


    public Colaborador(Integer codigo, Integer salario, Persona persona, TipoContrato tipoContrato, TipoSalario tipoSalario, Integer procesoDeRetencion, String salud, String pension, String arl) {
        this.codigo = codigo;
        this.salario = salario;
        this.persona = persona;
        this.tipoContrato = tipoContrato;
        this.tipoSalario = tipoSalario;
        this.procesoDeRetencion = procesoDeRetencion;
        this.salud = salud;
        this.pension = pension;
        this.arl = arl;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public TipoSalario getTipoSalario() {
        return tipoSalario;
    }

    public void setTipoSalario(TipoSalario tipoSalario) {
        this.tipoSalario = tipoSalario;
    }

    public Integer getProcesoDeRetencion() {
        return procesoDeRetencion;
    }

    public void setProcesoDeRetencion(Integer procesoDeRetencion) {
        this.procesoDeRetencion = procesoDeRetencion;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }
}
