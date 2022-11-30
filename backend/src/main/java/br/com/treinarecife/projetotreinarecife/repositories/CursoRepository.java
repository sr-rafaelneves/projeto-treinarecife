package br.com.treinarecife.projetotreinarecife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinarecife.projetotreinarecife.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{
    
}
