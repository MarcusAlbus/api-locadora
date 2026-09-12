package br.com.ctw.api_locadora.repository;

import br.com.ctw.api_locadora.entity.Ator;
import br.com.ctw.api_locadora.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaisRepository extends JpaRepository<Pais, Long> {

    boolean existsByPaisIgnoreCase(String pais);

    List<Pais> findByPaisContainingIgnoreCase(String pais);

}
