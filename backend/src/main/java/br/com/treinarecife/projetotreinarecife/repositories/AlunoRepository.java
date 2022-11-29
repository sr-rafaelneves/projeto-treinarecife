package br.com.treinarecife.projetotreinarecife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinarecife.projetotreinarecife.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
