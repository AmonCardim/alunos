package com.amoncardim.alunos.dto;

import java.time.LocalDate;
import java.util.List;

public record AlunoResponse(Long id, String nome, String Telefone, LocalDate dataNascimento, List<MatriculaDTO> matriculas) {
}