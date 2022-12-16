package br.com.treinarecife.projetotreinarecife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinarecife.projetotreinarecife.model.Feriado;
import br.com.treinarecife.projetotreinarecife.repositories.FeriadoRepository;

@RestController
@RequestMapping(value = "/feriado")
public class FeriadoController {
    
    @Autowired
    private FeriadoRepository repository;

    @GetMapping("/{id}")
    public Feriado findById(@PathVariable Integer id){
        Feriado result = repository.findById(id).get();
        return result;
    }

    @GetMapping
    public List<Feriado> All(){
        List<Feriado> result = repository.findAll();
        return result;
    }

    @PostMapping
    public Feriado insert(@RequestBody Feriado feriado){
        Feriado result = repository.save(feriado);
        return result;
    }


}
