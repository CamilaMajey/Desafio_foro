package com.aluracursos.foro.model;

import jakarta.persistence.Entity;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String password;

    // Getters y Setters
}