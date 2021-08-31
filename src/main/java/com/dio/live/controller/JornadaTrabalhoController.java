package com.dio.live.controller;

import com.dio.live.model.JornadaDeTrabalho;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaDeTrabalho createJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho) {
        return jornadaService.save(jornadaDeTrabalho);
    }
}
