package com.amoncardim.alunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amoncardim.alunos.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
}
