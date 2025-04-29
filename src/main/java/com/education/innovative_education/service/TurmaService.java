package com.education.innovative_education.service;

import com.education.innovative_education.dto.TurmaDTO;
import com.education.innovative_education.entities.Turma;
import com.education.innovative_education.mappers.TurmaMapper;
import com.education.innovative_education.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class TurmaService {

    @Autowired
    private final TurmaRepository repository;

    private final TurmaMapper mapper;


    public TurmaService(TurmaRepository repository, TurmaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    private TurmaDTO save(TurmaDTO dto) {
        Turma entity = mapper.toEntity(dto);
        entity = repository.save(entity);
        return mapper.toDto(entity);
    }

    private TurmaDTO update(TurmaDTO dto) {
        Turma entity = mapper.toEntity(dto);
        entity = repository.save(entity);
        return mapper.toDto(entity);
    }

    private TurmaDTO delete(Long id) {
        Turma entity = repository.findById(id).get();
        repository.delete(entity);
        return mapper.toDto(entity);
    }


    public TurmaDTO findById(Long id) {
        Turma entity = repository.findById(id).get();
        return mapper.toDto(entity);
    }


    public Iterable<TurmaDTO> findAll() {
        return Collections.singleton(mapper.toDto((Turma) repository.findAll()));
    }
}
