package com.ieadpe.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public interface CongregacaoService {

    Boolean removerCongregacao(BigInteger id);

}
