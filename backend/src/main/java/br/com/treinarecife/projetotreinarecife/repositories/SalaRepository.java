package br.com.treinarecife.projetotreinarecife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinarecife.projetotreinarecife.model.Sala;

public interface SalaRepository extends JpaRepository<Sala, Integer> {
    
}
