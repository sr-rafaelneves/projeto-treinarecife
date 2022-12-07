package br.com.treinarecife.projetotreinarecife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinarecife.projetotreinarecife.model.Lead;
import br.com.treinarecife.projetotreinarecife.repositories.LeadRepository;

@RestController
@RequestMapping(value = "/lead")
public class LeadController {
    
    @Autowired
    private LeadRepository repository;

    @PostMapping
    public Lead insert(@RequestBody Lead lead){
        Lead result = repository.save(lead);
        return result;
    }

    @GetMapping("/{id}")
    public Lead findById(@PathVariable Integer id){
        Lead result = repository.findById(id).get();
        return result;
    }

    @GetMapping
    public List<Lead> All(){
        List<Lead> result = repository.findAll();
        return result;
    }

}
