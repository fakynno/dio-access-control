package com.dio.live.service;

import com.dio.live.model.JornadaDeTrabalho;
import com.dio.live.repository.JornadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    public JornadaDeTrabalho save(JornadaDeTrabalho jornadaDeTrabalho) {
        return jornadaRepository.save(jornadaDeTrabalho);
    }

    public JornadaDeTrabalho updateJornada(JornadaDeTrabalho jornadaDeTrabalho) {
        return jornadaRepository.save(jornadaDeTrabalho);
    }

    public List<JornadaDeTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public void deleteJornada(Long id) {
        jornadaRepository.deleteById(id);
    }

    public Optional<JornadaDeTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

}
