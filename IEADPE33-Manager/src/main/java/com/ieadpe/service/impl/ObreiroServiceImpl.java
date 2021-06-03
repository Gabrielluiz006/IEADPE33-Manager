package com.ieadpe.service.impl;

import com.ieadpe.model.Obreiro;
import com.ieadpe.service.ObreiroService;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class ObreiroServiceImpl implements ObreiroService {

    @Override
    public Obreiro cadastrarObreiro(Obreiro obreiro) {
        return null;
    }

    @Override
    public Obreiro atualizarDadosObreiro(Obreiro obreiro) {
        return null;
    }

    @Override
    public Obreiro inativarObreiro(BigInteger idObreiro) {
        return null;
    }

    @Override
    public List<Obreiro> listarObreiros() {
        return null;
    }
}
