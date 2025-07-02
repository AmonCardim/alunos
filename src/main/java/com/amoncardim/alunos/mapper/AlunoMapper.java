package com.amoncardim.alunos.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.amoncardim.alunos.dto.AlunoRequest;
import com.amoncardim.alunos.dto.AlunoResponse;
import com.amoncardim.alunos.dto.MatriculaDTO;
import com.amoncardim.alunos.entity.Aluno;
import com.amoncardim.alunos.entity.Matricula;

@Component
public class AlunoMapper {

    public Aluno toEntity(AlunoRequest request) {
        Aluno aluno = new Aluno();
        aluno.setNome(request.nome());
        aluno.setDataNascimento(request.dataNascimento());
        aluno.setTelefone(request.telefone());
        List<Matricula> matriculas = request.matriculas().stream().map(m -> {
            Matricula matricula = new Matricula();
            matricula.setCodigoMatricula(m.codigoMatricula());
            matricula.setDataInicio(m.dataInicio());
            matricula.setNomeCurso(m.nomeCurso());

            return matricula;
        }).toList();
        aluno.setMatriculas(matriculas);
        return aluno;
    }

    public AlunoResponse AlunoResponse(Aluno aluno) {
        List<MatriculaDTO> matriculaDTOs = aluno.getMatriculas().stream().map(m -> 
            new MatriculaDTO(m.getCodigoMatricula(), m.getNomeCurso(), m.getDataInicio())).toList();
            return new AlunoResponse(aluno.getId(), aluno.getNome(), aluno.getTelefone(), aluno.getDataNascimento(), matriculaDTOs);
    }
}
