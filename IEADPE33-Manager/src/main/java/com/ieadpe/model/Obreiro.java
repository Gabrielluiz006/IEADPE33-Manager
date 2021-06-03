package com.ieadpe.model;

import java.math.BigInteger;
import java.util.Objects;

public class Obreiro {

    private BigInteger idObreiro;
    private String nomeObreiro;
    private Congregacao congregacao;
    private String cargo;

    public BigInteger getIdObreiro() {
        return idObreiro;
    }

    public void setIdObreiro(BigInteger idObreiro) {
        this.idObreiro = idObreiro;
    }

    public String getNomeObreiro() {
        return nomeObreiro;
    }

    public void setNomeObreiro(String nomeObreiro) {
        this.nomeObreiro = nomeObreiro;
    }

    public Congregacao getCongregacao() {
        return congregacao;
    }

    public void setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObreiro, nomeObreiro, congregacao, cargo);
    }
}
