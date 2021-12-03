package com.superdevs.filmes.api;

import java.util.List;

import com.superdevs.filmes.model.TipoFilme;
import com.superdevs.filmes.repository.TipoFilmeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipofilme")
public class TipoFilmeApi {
    
    @Autowired
    private TipoFilmeRepository rep;

    @GetMapping
    public List<TipoFilme> list(){
        return (List<TipoFilme>)rep.findAll();
    }
    
    @PostMapping   
    public String create(@RequestBody TipoFilme model){
        rep.save(model);
        return "salvo com sucesso";
    }

    @DeleteMapping("/{id}")    
    public String delete(@PathVariable int id){
        rep.deleteById(id);
        return "deletado com sucesso";
    }

    @PutMapping("/{id}")    
    public String update(@RequestBody TipoFilme model, @PathVariable int id){
        model.setId(id);
        rep.save(model);
        return "alterado com sucesso";
    }
}