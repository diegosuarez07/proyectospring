package com.example.diego.proyectospring.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "genero")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Getter
@Setter
public class GeneroEntity {

    @Id
    @Column (name = "id_genero")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "imagen_genero")
    private String imagen;

    @Column(name = "nombre_genero")
    private String nombre;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    private Set<PeliculaEntity> peliculas = new HashSet<>();

    public Set<PeliculaEntity> getPeliculas(){
        return this.peliculas;
    }

    public void agregarPelicula(PeliculaEntity peliculaEntity){
        peliculas.add(peliculaEntity);
    }

    public void setPeliculas(Set<PeliculaEntity> peliculas){
        this.peliculas = peliculas;
        for(PeliculaEntity peliculaEntity: peliculas){
            peliculaEntity.setGenero(this);
        }
    }
}
