package com.ieadpe.model;

import java.math.BigInteger;

public class Congregacao {

    private BigInteger idCongregacao;
    private String nomeCongregacao;
    private String numeroArea;

    public BigInteger getIdCongregacao() {
        return idCongregacao;
    }

    public void setIdCongregacao(BigInteger idCongregacao) {
        this.idCongregacao = idCongregacao;
    }

    public String getNomeCongregacao() {
        return nomeCongregacao;
    }

    public void setNomeCongregacao(String nomeCongregacao) {
        this.nomeCongregacao = nomeCongregacao;
    }

    public String getNumeroArea() {
        return numeroArea;
    }

    public void setNumeroArea(String numeroArea) {
        this.numeroArea = numeroArea;
    }
}
