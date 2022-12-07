package br.com.treinarecife.projetotreinarecife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinarecife.projetotreinarecife.model.Sala;
import br.com.treinarecife.projetotreinarecife.repositories.SalaRepository;

@RestController
@RequestMapping(value = "/sala")
public class SalaController {
    
    @Autowired
    private SalaRepository repository;

    @PostMapping
    public Sala insert(@RequestBody Sala sala){
        Sala result = repository.save(sala);
        return result;
    }

    @GetMapping("/{id}")
    public Sala findById(Integer id){
        Sala result = repository.findById(id).get();
        return result;
    }

    @GetMapping
    public List<Sala> All(){
        List<Sala> result = repository.findAll();
        return result;
    }



}

