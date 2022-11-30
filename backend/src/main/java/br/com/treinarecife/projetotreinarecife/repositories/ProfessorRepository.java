package br.com.treinarecife.projetotreinarecife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinarecife.projetotreinarecife.model.Professor;

public interface ProfessorRepository  extends JpaRepository<Professor, Integer> {
    
}
