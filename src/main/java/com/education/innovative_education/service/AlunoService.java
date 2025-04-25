package com.education.innovative_education.service;

import com.education.innovative_education.dto.AlunoDTO;
import com.education.innovative_education.entities.Aluno;
import com.education.innovative_education.mappers.AlunoMapper;
import com.education.innovative_education.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;


@Service
public class AlunoService {


//    private final AlunoMapper mapper = AlunoMapper.INSTANCE;

    @Autowired
    private final AlunoRepository repository;

    private final AlunoMapper mapper;


    public AlunoService(AlunoRepository repository, AlunoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    public AlunoDTO save(AlunoDTO dto) {
        Aluno entity = mapper.toAluno(dto);
        entity = repository.save(entity);
        return mapper.toAlunoDTO(entity);
    }

    public AlunoDTO update(AlunoDTO dto) {
        Aluno entity = mapper.toAluno(dto);
        entity = repository.save(entity);
        return mapper.toAlunoDTO(entity);
    }

    public void delete(AlunoDTO dto) {
        Aluno entity = mapper.toAluno(dto);
        repository.delete(entity);
    }


    public AlunoDTO findById(Long id) {
        Aluno entity = repository.findById(id).get();
        return mapper.toAlunoDTO(entity);
    }


    public Iterable<AlunoDTO> findAll() {
        return Collections.singleton(mapper.toAlunoDTO((Aluno) repository.findAll()));
    }


}
