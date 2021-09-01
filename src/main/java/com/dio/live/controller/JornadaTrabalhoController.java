package com.dio.live.controller;

import com.dio.live.model.JornadaDeTrabalho;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaDeTrabalho createJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho) {
        return jornadaService.save(jornadaDeTrabalho);
    }

    @GetMapping
    public List<JornadaDeTrabalho> findAll() {
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaDeTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaService
                .getById(idJornada)
                .orElseThrow(
                        () -> new NoSuchElementException("Id não encontrado")));

    }

    @PutMapping
    public JornadaDeTrabalho updateJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho) {
        return jornadaService.updateJornada(jornadaDeTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaDeTrabalho>) ResponseEntity.ok();
    }

}
