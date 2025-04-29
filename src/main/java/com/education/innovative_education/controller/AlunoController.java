package com.education.innovative_education.controller;


import com.education.innovative_education.dto.AlunoDTO;
import com.education.innovative_education.service.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }
    @PostMapping("/createAluno")
    public ResponseEntity<AlunoDTO> createAluno(@RequestBody AlunoDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }
    @PutMapping("/updateAluno")
    public ResponseEntity<AlunoDTO> update(@RequestBody AlunoDTO dto) {
        return ResponseEntity.ok(service.update(dto));
    }

    @DeleteMapping("/deleteAluno")
    public ResponseEntity delete(@PathVariable Long id) {
        return ResponseEntity.ok(service.delete(id));
    }

    @RequestMapping("/findAluno/{id}")
    public AlunoDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @RequestMapping("/findAllAluno")
    public Iterable<AlunoDTO> findAll() {

        return service.findAll();
    }
}

