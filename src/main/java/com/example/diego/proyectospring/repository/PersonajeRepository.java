package com.example.diego.proyectospring.repository;

import com.example.diego.proyectospring.entity.PersonajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<PersonajeEntity, Long> {
}
