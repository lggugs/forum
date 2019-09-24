package br.com.alura.forum.repository;

import br.com.alura.forum.model.Topico;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Luis
 */
public interface TopicoRepository extends JpaRepository<Topico, Long>{    

    Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);    
}
