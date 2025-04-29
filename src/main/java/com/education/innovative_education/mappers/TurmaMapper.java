package com.education.innovative_education.mappers;

import com.education.innovative_education.dto.TurmaDTO;
import com.education.innovative_education.entities.Turma;
import org.mapstruct.Mapper;

@Mapper
public interface TurmaMapper {

    TurmaDTO toDto(Turma turma);
    Turma toEntity(TurmaDTO dto);


}
