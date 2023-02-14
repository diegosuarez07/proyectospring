package com.example.diego.proyectospring.service;

import com.example.diego.proyectospring.entity.GeneroEntity;
import com.example.diego.proyectospring.entity.PeliculaEntity;
import com.example.diego.proyectospring.repository.GeneroRepository;
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
public class GeneroService implements GeneroRepository {

    @Autowired
    private GeneroRepository generoRepository;

    @Override
    public <S extends GeneroEntity> S save(S entity) {
        return generoRepository.save(entity);
    }

    public GeneroEntity saveGeneroEntity(GeneroEntity generoEntity){
        return generoRepository.save(generoEntity);
    }

    @Override
    public <S extends GeneroEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<GeneroEntity> findById(Long aLong) {
        return generoRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<GeneroEntity> findAll() {
        return generoRepository.findAll();
    }

    @Override
    public Iterable<GeneroEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        generoRepository.deleteById(aLong);
    }

    @Override
    public void delete(GeneroEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends GeneroEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
