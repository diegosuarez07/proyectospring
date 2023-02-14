package com.example.diego.proyectospring.controller;

import com.example.diego.proyectospring.entity.GeneroEntity;
import com.example.diego.proyectospring.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/generos/")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @GetMapping("/")
    public Collection<GeneroEntity> consultarGeneros(){
        return (Collection<GeneroEntity>) generoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<GeneroEntity>> consultarUnGenero(@PathVariable Long id){
        Optional<GeneroEntity> generoEncontrado = generoService.findById(id);
        if(generoEncontrado != null){
            return ResponseEntity.ok(generoEncontrado);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarGenero(@PathVariable Long id){
        if(generoService.findById(id) != null){
            generoService.deleteById(id);
            return ResponseEntity.ok().build();
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping()
    public ResponseEntity guardarGenero(@RequestBody GeneroEntity nuevoGenero) {
        try {
            generoService.saveGeneroEntity(nuevoGenero);
            return new ResponseEntity<>(nuevoGenero, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("Datos invalidos", HttpStatus.BAD_REQUEST);}
        }
}
