package com.ieadpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObreiroController {

    @GetMapping("/obreiros")
    String listaObreiros(){
        return "listaobreiros";
    }
}
