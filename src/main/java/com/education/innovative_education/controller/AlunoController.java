package com.education.innovative_education.controller;


import com.education.innovative_education.dto.AlunoDTO;
import com.education.innovative_education.service.AlunoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }
    @PostMapping("/create")
    public AlunoDTO createAluno(@RequestBody AlunoDTO dto) {
        return service.save(dto);
    }

    public AlunoDTO update(AlunoDTO dto) {
        return service.update(dto);
    }

    public void delete(AlunoDTO dto) {
        service.delete(dto);
    }

    public AlunoDTO findById(Long id) {
        return service.findById(id);
    }

    public Iterable<AlunoDTO> findAll() {
        return service.findAll();
    }
}

