package br.com.alura.forum.repository;

import br.com.alura.forum.model.Topico;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Luis
 */
public interface TopicoRepository extends JpaRepository<Topico, Long>{    

    List<Topico> findByCursoNome(String nomeCurso);    
}
