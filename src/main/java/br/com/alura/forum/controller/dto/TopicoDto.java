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
import org.springframework.data.domain.Page;

/**
 *
 * @author Luis Lima
 */
public class TopicoDto {


    public static Page<TopicoDto> converter(Page<Topico> topicos) {
        return topicos.map(TopicoDto::new);

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
