package com.aluracursos.foro.controller;

import com.aluracursos.foro.model.Topico;
import com.aluracursos.foro.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
public class TopicoController {
    @Autowired
    private TopicoService topicoService;

    public ResponseEntity<List<Topico>> listar() {
        return ResponseEntity.ok(topicoService.listar());
    }

    @PostMapping
    public ResponseEntity<Topico> crear(@RequestBody Topico topico) {
        return ResponseEntity.status(201).body(topicoService.crear(topico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        topicoService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
