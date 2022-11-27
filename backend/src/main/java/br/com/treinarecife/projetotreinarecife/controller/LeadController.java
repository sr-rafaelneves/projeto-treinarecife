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

@RestController
@RequestMapping(value = "/lead")
public class LeadController {
    @Autowired
    private LeadController repository;

    @GetMapping
    public Lead findById(@PathVariable Integer idLead){
        Lead result = repository.findById(idLead).get();
        return result;
    }

    @PostMapping
    public Lead insert(@RequestBody Lead lead){
        Lead result = repository.save(lead);
        return result;
    }

    private Lead save(Lead lead) {
        return null;
    }

    @GetMapping
    public List<Lead> All(){
        List<Lead> result = repository.findAll();
        return result;
    }

    private List<Lead> findAll() {
        return null;
    }
}
