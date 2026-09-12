package br.com.ctw.api_locadora.repository;

import br.com.ctw.api_locadora.dto.AtorCreateRequest;
import br.com.ctw.api_locadora.entity.Ator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AtorRepository extends JpaRepository<Ator, Long>{

     boolean existsByPrimeiroNomeIgnoreCaseAndUltimoNomeIgnoreCase(String primeiroNome, String ultimoNome);

     List<Ator> findByPrimeiroNomeContainingIgnoreCaseAndUltimoNomeContainingIgnoreCase(String primeiroNome, String ultimoNome);
}
