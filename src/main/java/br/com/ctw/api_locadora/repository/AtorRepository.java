package br.com.ctw.api_locadora.repository;

import br.com.ctw.api_locadora.entity.Ator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AtorRepository extends JpaRepository<Ator, Long>{

     boolean existsByNomeIgnoreCase(String primeiroNome, String ultimoNome);

     Optional<Ator> findById (Long atorId);

}
