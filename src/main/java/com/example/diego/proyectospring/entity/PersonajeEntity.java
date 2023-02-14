package com.example.diego.proyectospring.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_personaje")
    private Long id;

    @Column(name = "nombre_personaje")
    private String nombre;

    @Column(name = "edad_personaje")
    private int edad;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculas = new ArrayList<>();
}
