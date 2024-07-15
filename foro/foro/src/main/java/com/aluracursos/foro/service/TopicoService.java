package com.aluracursos.foro.service;

import com.aluracursos.foro.model.Topico;
import com.aluracursos.foro.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> listar() {
        return topicoRepository.findAll();
    }

    public Topico crear(Topico topico) {
        return topicoRepository.save(topico);
    }

    public void eliminar(Long id) {
        topicoRepository.deleteById(id);
    }
}