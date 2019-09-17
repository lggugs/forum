/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.forum.controller.dto;

import br.com.alura.forum.model.Topico;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author x44h
 */
public class TopicoDto {


    public static List<TopicoDto> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
    }
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCricao;    

    public TopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo =topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCricao = topico.getDataCriacao();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCricao() {
        return dataCricao;
    }
}
