package br.com.treinarecife.projetotreinarecife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinarecife.projetotreinarecife.repositories.CursoRepository;

@RestController
@RequestMapping(value = "/Curso")
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
