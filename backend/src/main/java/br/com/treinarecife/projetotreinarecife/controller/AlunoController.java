package br.com.treinarecife.projetotreinarecife.controller;

import java.util.List;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinarecife.projetotreinarecife.model.Aluno;
import br.com.treinarecife.projetotreinarecife.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
    
    @Autowired
    private AlunoRepository repository;

    @GetMapping("/{id}")
    public Aluno findById(@PathVariable Integer idAluno){
        Aluno result = repository.findById(idAluno).get();
        return result;
    }

    @PostMapping
    public Aluno insert(@RequestBody Aluno aluno){
        Aluno result = repository.save(aluno);
        return result;
    }

    @GetMapping
    public List<Aluno> All(){
        List<Aluno> result = repository.findAll();
        return result;
    }

}
