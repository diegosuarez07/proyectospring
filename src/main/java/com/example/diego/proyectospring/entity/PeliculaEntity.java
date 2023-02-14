package com.example.diego.proyectospring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "pelicula")
@Getter
@Setter
public class PeliculaEntity {

    @Id
    @Column (name = "id_pelicula")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "calificacion_pelicula")
    private int calificacion;

    @Column(name = "nombre_pelicula")
    private String nombre;

    @ManyToOne()
    @JoinColumn(name = "id_genero")
    private GeneroEntity genero;

    public GeneroEntity getGenero() {
        return genero;
    }

    public void setGenero(GeneroEntity genero) {
        this.genero = genero;
    }

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "peliculas_x_personajes",
            joinColumns = @JoinColumn(name = "id_pelicula"),
            inverseJoinColumns = @JoinColumn(name = "id_personaje"))
    private Set<PersonajeEntity> personajes = new HashSet<>();

    public void agregarPersonaje(PersonajeEntity personajeEntityNuevo){
        if(this.personajes == null){
            this.personajes = new HashSet<>();
        }
        this.personajes.add(personajeEntityNuevo);
        personajeEntityNuevo.getPeliculas().add(this);
    }

    public void eliminarPersonaje(PersonajeEntity personajeEntity) {
        personajes.remove(personajeEntity);
        personajeEntity.getPeliculas().remove(this);
    }

}
