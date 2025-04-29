package com.education.innovative_education.entities;

import com.education.innovative_education.entities.enuns.Turno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTurma;

    private String codigoTurma;

    private String nomeTurma;

    private int vagasTurma;

    @Enumerated(value = EnumType.STRING)
    private Turno turnoTurma;







}
