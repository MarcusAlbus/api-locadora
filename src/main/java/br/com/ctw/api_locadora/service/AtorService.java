package br.com.ctw.api_locadora.service;

import br.com.ctw.api_locadora.dto.AtorCreateRequest;
import br.com.ctw.api_locadora.entity.Ator;
import br.com.ctw.api_locadora.repository.AtorRepository;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;
@Service
public class AtorService {

    private final AtorRepository atorRepository;
    private final Ator ator;

    public AtorService(Ator ator, AtorRepository atorRepository){
        this.ator =ator;
        this.atorRepository= atorRepository;
    }


    public Ator cadastrar(AtorCreateRequest request){
        if(atorRepository.existsByNomeIgnoreCase(ator.getPrimeiroNome(), ator.getUltimoNome())){
            throw new IllegalArgumentException("Já existe um ator com esse nome");
        }
        return null;
    }



}

