package com.amoncardim.alunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amoncardim.alunos.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}