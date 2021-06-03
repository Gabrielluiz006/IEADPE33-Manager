package com.ieadpe.controller;

import com.ieadpe.model.Congregacao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CongregacaoController {

    @GetMapping("/congregacoes")
    String listarCongregacoes(Model model){

        List<Congregacao> congregacoes = new ArrayList<>();

        for(int i = 0 ; i<20 ; i++){
            Congregacao congregacao = new Congregacao();
            congregacao.setIdCongregacao(new BigInteger(String.valueOf(i)));
            congregacao.setNomeCongregacao("congregacao" + i);
            congregacao.setNumeroArea(String.valueOf(i));
            congregacoes.add(congregacao);
        }

        model.addAttribute("congregacoes", congregacoes);

        return "listacongrecacao";
    }
}
