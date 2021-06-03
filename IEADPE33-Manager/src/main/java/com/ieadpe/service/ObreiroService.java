package com.ieadpe.service;

import com.ieadpe.model.Obreiro;

import java.math.BigInteger;
import java.util.List;

public interface ObreiroService {

    Obreiro cadastrarObreiro(Obreiro obreiro);

    Obreiro atualizarDadosObreiro(Obreiro obreiro);

    Obreiro inativarObreiro(BigInteger idObreiro);

    List<Obreiro> listarObreiros();
}
