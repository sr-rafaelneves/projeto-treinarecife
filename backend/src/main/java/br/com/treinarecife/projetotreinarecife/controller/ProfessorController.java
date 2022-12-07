package br.com.treinarecife.projetotreinarecife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinarecife.projetotreinarecife.model.Professor;
import br.com.treinarecife.projetotreinarecife.repositories.ProfessorRepository;

@RestController
@RequestMapping(value ="/professor")
public class ProfessorController {
    
    @Autowired
    private ProfessorRepository repository;

    @PostMapping("/{id}")
    public Professor insert(@RequestBody Professor professor){
        Professor result = repository.save(professor);
        return result;
    }

    @GetMapping
    public Professor findById(@PathVariable Integer id){
        Professor result = repository.findById(id).get();
        return result;
    }

    @GetMapping
    public List<Professor> all(){
        List<Professor> result = repository.findAll();
        return result;
    }
}
