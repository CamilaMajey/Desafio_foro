package com.aluracursos.foro.repository;

import com.aluracursos.foro.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}