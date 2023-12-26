/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.practicaAWS.webapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.practicaAWS.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.spring.practicaAWS.model.Usuario;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author enriq
 */

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
     @Autowired
    private UsuarioRepository usRepository;

    @GetMapping
    List<Usuario> getAll() {
        return usRepository.findAll();
    }

    @PostMapping
    Usuario create(@RequestBody Usuario usuario) {

        return usRepository.save(usuario);

    }
    
}
