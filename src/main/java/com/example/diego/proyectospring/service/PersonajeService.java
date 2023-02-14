package com.example.diego.proyectospring.service;

import com.example.diego.proyectospring.entity.PersonajeEntity;
import com.example.diego.proyectospring.repository.PersonajeRepository;
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
public class PersonajeService implements PersonajeRepository {

    @Autowired
    private PersonajeRepository personajeRepository;

    @Override
    public void flush() {
    }

    @Override
    public <S extends PersonajeEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends PersonajeEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<PersonajeEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PersonajeEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public PersonajeEntity getById(Long aLong) {
        return null;
    }

    @Override
    public PersonajeEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends PersonajeEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PersonajeEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PersonajeEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PersonajeEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PersonajeEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PersonajeEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends PersonajeEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends PersonajeEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PersonajeEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PersonajeEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<PersonajeEntity> findAll() {
        return personajeRepository.findAll();
    }

    @Override
    public List<PersonajeEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(PersonajeEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends PersonajeEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<PersonajeEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PersonajeEntity> findAll(Pageable pageable) {
        return null;
    }
}
