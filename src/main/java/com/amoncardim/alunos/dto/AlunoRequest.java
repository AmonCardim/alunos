package com.amoncardim.alunos.dto;

import java.time.LocalDate;
import java.util.List;

public record AlunoRequest(String nome, String telefone, LocalDate dataNascimento, List<MatriculaDTO> matriculas) {
}