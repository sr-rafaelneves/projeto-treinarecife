package br.com.treinarecife.projetotreinarecife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinarecife.projetotreinarecife.model.Feriado;

public interface FeriadoRepository extends JpaRepository<Feriado, Integer> {
    
}
