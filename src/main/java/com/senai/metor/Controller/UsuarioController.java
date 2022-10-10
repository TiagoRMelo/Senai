package com.senai.metor.Controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.senai.metor.Repositories.UsuarioRepository;
import com.senai.metor.domain.Usuario;



@CrossOrigin("*")
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository  usuarioRepository;

    @GetMapping
    public ResponseEntity<List<Usuario>> findALL(){
        List<Usuario> consultarTodasEstacoes = usuarioRepository.findAll();
        return ResponseEntity.ok().body(consultarTodasEstacoes);      
    }


    @PostMapping 
    public ResponseEntity<Usuario> insEstacao(@Valid @RequestBody Usuario pUsuario){
        Integer maxId = usuarioRepository.getMaxIdUsuario();
        if(maxId == null){
            maxId = 0;
        }
        pUsuario.setIdusuario(maxId+1); 
        usuarioRepository.save(pUsuario);
        URI vUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pUsuario.getIdusuario()).toUri();
        return ResponseEntity.created(vUri).body(pUsuario);
    }
   

}


