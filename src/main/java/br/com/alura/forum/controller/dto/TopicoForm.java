package br.com.alura.forum.controller.dto;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.CursoRepository;

/**
 *
 * @author Luis Lima
 */
public class TopicoForm {

    private String titulo;
    private String mensagem;
    private String curso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Topico converter(CursoRepository cursoRepository){
        Curso curso = cursoRepository.findByNome(this.curso);
        return new Topico(this.titulo, mensagem, curso);
    }
}
