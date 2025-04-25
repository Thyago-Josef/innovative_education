package com.education.innovative_education.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAluno;

    private String nomeAluno;

    private String emailAluno;

    private String matriculaAluno;

    private String cpfAluno;

    private String rgAluno;

    private String dataNascAluno;

    private String dataMatriculaAluno;

    private String telefoneAluno;

    private String nomePaiAluno;

    private String nomeMaeAluno;

    private String nomeResponsavelAluno;

    private String emailResponsavelAluno;

    private String telefoneResponsavelAluno;



}
