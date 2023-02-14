package com.example.diego.proyectospring.repository;

import com.example.diego.proyectospring.entity.GeneroEntity;
import com.example.diego.proyectospring.entity.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository<GeneroEntity, Long> {
}
