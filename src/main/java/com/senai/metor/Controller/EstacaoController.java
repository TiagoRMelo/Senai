package com.senai.metor.Controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.senai.metor.Repositories.EstacaoRespository;
import com.senai.metor.domain.Estacao;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/estacao")
public class EstacaoController {
    
    @Autowired
    private EstacaoRespository  EstRepository;

    @GetMapping
    public ResponseEntity<List<Estacao>> findALL(){
        List<Estacao> consultarTodasEstacoes = EstRepository.findAll();
        return ResponseEntity.ok().body(consultarTodasEstacoes);      
    }


    @PostMapping 
    public ResponseEntity<Estacao> insEstacao(@Valid @RequestBody Estacao pEstacao){
        Integer maxId = EstRepository.getMaxIdEstacao();
        if(maxId == null){
            maxId = 0;
        }
        pEstacao.setIdestacao(maxId+1); 
        EstRepository.save(pEstacao);
        URI vUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pEstacao.getIdestacao()).toUri();
        return ResponseEntity.created(vUri).body(pEstacao);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delEstacao(@PathVariable Integer id){
        EstRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
