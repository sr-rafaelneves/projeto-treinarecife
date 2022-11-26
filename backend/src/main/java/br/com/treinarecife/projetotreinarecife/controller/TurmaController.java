package br.com.treinarecife.projetotreinarecife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinarecife.projetotreinarecife.model.Turma;
import br.com.treinarecife.projetotreinarecife.repositories.TurmaRepository;

@RestController
@RequestMapping(value = "/turma")
public class TurmaController {
    
    @Autowired
    private TurmaRepository repository;

    @GetMapping
    public Turma findById(@PathVariable Integer idTurma){
        Turma result = repository.findById(idTurma).get();
        return result;
    }

    @PostMapping
    public Turma insert(@RequestBody Turma turma){
        Turma result = repository.save(turma);
        return result;
    }

    @GetMapping
    public List<Turma> All(){
        List<Turma> result = repository.findAll();
        return result;
    }
    
}
