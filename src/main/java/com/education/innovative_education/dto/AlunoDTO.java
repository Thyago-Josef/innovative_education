package com.education.innovative_education.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDTO {


    public AlunoDTO(String nomeAluno, String emailAluno, String matriculaAluno, String cpfAluno, String rgAluno,
                    Date dataNascAluno, String dataMatriculaAluno, String telefoneAluno, String nomePaiAluno,
                    String nomeMaeAluno, String nomeResponsavelAluno, String emailResponsavelAluno) {
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
        this.matriculaAluno = matriculaAluno;
        this.cpfAluno = cpfAluno;
        this.rgAluno = rgAluno;
        this.dataNascAluno = dataNascAluno;
        this.dataMatriculaAluno = dataMatriculaAluno;
        this.telefoneAluno = telefoneAluno;
        this.nomePaiAluno = nomePaiAluno;
        this.nomeMaeAluno = nomeMaeAluno;
        this.nomeResponsavelAluno = nomeResponsavelAluno;
        this.emailResponsavelAluno = emailResponsavelAluno;
    }

    public AlunoDTO(Long idAluno, String nomeAluno, String emailAluno, String matriculaAluno, String cpfAluno, String rgAluno,
                    Date dataNascAluno, String dataMatriculaAluno, String telefoneAluno, String nomePaiAluno,
                    String nomeMaeAluno, String nomeResponsavelAluno, String emailResponsavelAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
        this.matriculaAluno = matriculaAluno;
        this.cpfAluno = cpfAluno;
        this.rgAluno = rgAluno;
        this.dataNascAluno = dataNascAluno;
        this.dataMatriculaAluno = dataMatriculaAluno;
        this.telefoneAluno = telefoneAluno;
        this.nomePaiAluno = nomePaiAluno;
        this.nomeMaeAluno = nomeMaeAluno;
        this.nomeResponsavelAluno = nomeResponsavelAluno;
        this.emailResponsavelAluno = emailResponsavelAluno;
    }



    private Long idAluno;

    @NotBlank(message = "O nome do aluno deve ser informado")
    private String nomeAluno;
    @NotBlank(message = "O email do aluno deve ser informado")
    private String emailAluno;
    @NotBlank(message = "A matricula do aluno deve ser informada")
    private String matriculaAluno;
    @NotBlank(message = "O cpf do aluno deve ser informado")
    private String cpfAluno;
    @NotBlank(message = "O rg do aluno deve ser informado")
    private String rgAluno;

    private Date dataNascAluno;
    private String dataMatriculaAluno;
    private String telefoneAluno;
    private String nomePaiAluno;
    private String nomeMaeAluno;
    private String nomeResponsavelAluno;
    private String emailResponsavelAluno;
    private String telefoneResponsavelAluno;
}
