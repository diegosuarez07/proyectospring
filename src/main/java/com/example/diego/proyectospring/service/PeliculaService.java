package com.example.diego.proyectospring.service;

import com.example.diego.proyectospring.entity.PeliculaEntity;
import com.example.diego.proyectospring.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PeliculaService implements PeliculaRepository {

    @Autowired
    private PeliculaRepository peliculaRepository;


    @Override
    public <S extends PeliculaEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PeliculaEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PeliculaEntity> findById(Long aLong) {
        return peliculaRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<PeliculaEntity> findAll() {
        return peliculaRepository.findAll();
    }

    public PeliculaEntity savePeliculaEntity(PeliculaEntity peliculaEntity){
        return peliculaRepository.save(peliculaEntity);
    }

    @Override
    public Iterable<PeliculaEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PeliculaEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends PeliculaEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
