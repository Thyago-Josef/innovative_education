package com.education.innovative_education.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDTO {

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
