package com.education.innovative_education.mappers;


import com.education.innovative_education.dto.AlunoDTO;
import com.education.innovative_education.entities.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AlunoMapper {

//    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);

    AlunoDTO toAlunoDTO(Aluno aluno);

    Aluno toAluno(AlunoDTO alunoDTO);
}
