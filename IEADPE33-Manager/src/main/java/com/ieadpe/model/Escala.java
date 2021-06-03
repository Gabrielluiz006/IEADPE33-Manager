package com.ieadpe.model;

import java.math.BigInteger;
import java.util.Calendar;

public class Escala {

    private BigInteger idEscala;
    private Calendar mesAnoEscala;
    private Obreiro obreiros;
    private Congregacao congregacao;

    public BigInteger getIdEscala() {
        return idEscala;
    }

    public void setIdEscala(BigInteger idEscala) {
        this.idEscala = idEscala;
    }

    public Calendar getMesAnoEscala() {
        return mesAnoEscala;
    }

    public void setMesAnoEscala(Calendar mesAnoEscala) {
        this.mesAnoEscala = mesAnoEscala;
    }

    public Obreiro getObreiros() {
        return obreiros;
    }

    public void setObreiros(Obreiro obreiros) {
        this.obreiros = obreiros;
    }

    public Congregacao getCongregacao() {
        return congregacao;
    }

    public void setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
    }
}
