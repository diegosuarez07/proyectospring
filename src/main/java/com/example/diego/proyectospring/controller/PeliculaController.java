package com.example.diego.proyectospring.controller;

import com.example.diego.proyectospring.entity.GeneroEntity;
import com.example.diego.proyectospring.entity.PeliculaEntity;
import com.example.diego.proyectospring.service.GeneroService;
import com.example.diego.proyectospring.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @Autowired
    private GeneroService generoService;

    @GetMapping("/")
    public Collection<PeliculaEntity> consultarPeliculas(){
        return (Collection<PeliculaEntity>) peliculaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<PeliculaEntity>> consultarUnaPelicula(@PathVariable Long id){
        Optional<PeliculaEntity> peliculaEncontrada = peliculaService.findById(id);
        if(peliculaEncontrada != null){
            return ResponseEntity.ok(peliculaEncontrada);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<PeliculaEntity> guardarPelicula(@RequestBody PeliculaEntity pelicula){
        Optional<GeneroEntity> generoOptional = generoService.findById(pelicula.getGenero().getId());
        if(!generoOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        pelicula.setGenero(generoOptional.get());
        PeliculaEntity peliculaRecibida = peliculaService.savePeliculaEntity(pelicula);
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaRecibida);
    }
}
