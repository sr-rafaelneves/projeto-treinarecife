package br.com.treinarecife.projetotreinarecife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.treinarecife.projetotreinarecife.model.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer>{

}
