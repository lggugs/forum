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
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author x44h
 * 
 * 
 */
@RestController //Não precisa definir o responseBody nos métodos 
public class Topicoscontroller {
    @RequestMapping("/topicos")    
    public List<TopicoDto> lista(){ 
        Topico topico = new Topico("Dúvida TESTE", "Dúvida com Spring", new Curso("Spring", "Programação"));        
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
