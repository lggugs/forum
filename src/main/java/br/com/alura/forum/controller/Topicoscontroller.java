/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.forum.controller;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.controller.dto.TopicoDto;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author x44h
 * 
 * 
 */
@RestController //Não precisa definir o responseBody nos métodos 
public class Topicoscontroller {
    @Autowired
    private TopicoRepository topicoRepository;
    
    @RequestMapping("/topicos")    
    public List<TopicoDto> lista(String nomeCurso){ 
        if (null == nomeCurso){            
            List<Topico> topicos = topicoRepository.findAll();        
            return TopicoDto.converter(topicos);
        }else{
            List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);        
            return TopicoDto.converter(topicos);            
        }
    }
}
