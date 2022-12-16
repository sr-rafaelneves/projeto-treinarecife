package br.com.treinarecife.projetotreinarecife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.treinarecife.projetotreinarecife.model.Curso;
import br.com.treinarecife.projetotreinarecife.repositories.CursoRepository;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {
    
    @Autowired
    private CursoRepository repository;

    @GetMapping("/{id}")
    public Curso findById(@PathVariable Integer idCurso){
        Curso result = repository.findById(idCurso).get();
        return result;
    }

    @PostMapping
    public Curso insert(@RequestBody Curso curso){
        Curso result = repository.save(curso);
        return result;
    }

    @GetMapping
    public List<Curso> All(){
        List<Curso> result = repository.findAll();
        return result;
    }
}
