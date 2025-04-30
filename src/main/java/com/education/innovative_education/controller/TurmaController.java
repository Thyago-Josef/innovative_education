package com.education.innovative_education.controller;

import com.education.innovative_education.dto.TurmaDTO;
import com.education.innovative_education.service.TurmaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    private final TurmaService service;


    public TurmaController(TurmaService service) {
        this.service = service;
    }


    @RequestMapping("/findTurma/{id}")
    public TurmaDTO findByIdTurma(Long id) {
        return service.findById(id);
    }

    @RequestMapping("/findAllTurma")
    public Iterable<TurmaDTO> findAllTurma() {
        return service.findAll();
    }


    @PostMapping("/createTurma")
    public ResponseEntity<TurmaDTO> createTurma(@RequestBody TurmaDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }
    @PutMapping("/updateTurma")
    public ResponseEntity<TurmaDTO> atualizarTurma(@RequestBody TurmaDTO dto) {
        return ResponseEntity.ok(service.update(dto));
    }

    @DeleteMapping("/deleteTurma")
    public ResponseEntity deleteTurma(@PathVariable Long id) {
        return ResponseEntity.ok(service.delete(id));
    }


}
