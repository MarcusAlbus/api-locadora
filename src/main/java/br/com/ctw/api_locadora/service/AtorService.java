package br.com.ctw.api_locadora.service;

import br.com.ctw.api_locadora.dto.AtorCreateRequest;
import br.com.ctw.api_locadora.dto.AtorPatchRequest;
import br.com.ctw.api_locadora.dto.AtorResponse;
import br.com.ctw.api_locadora.dto.AtorUpdateRequest;
import br.com.ctw.api_locadora.entity.Ator;
import br.com.ctw.api_locadora.mapper.AtorMapper;
import br.com.ctw.api_locadora.repository.AtorRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.security.Timestamp;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class AtorService {

    private final AtorRepository atorRepository;
    private final AtorMapper mapper;

    @Transactional
    public AtorResponse cadastrar(AtorCreateRequest request){
        if(atorRepository.existsByPrimeiroNomeIgnoreCaseAndUltimoNomeIgnoreCase(request.primeiroNome(), request.ultimoNome())){
            throw new IllegalArgumentException("Já existe um ator com esse nome");
        }


       Ator ator = mapper.toEntity(request);
       Ator salvo = atorRepository.save(ator);

        return mapper.toResponse(salvo);
    }

    @Transactional (readOnly = true)
    public List<AtorResponse> listar(){
        List<Ator> atores = atorRepository.findAll();
        return mapper.toResponseList(atores);
    }


    @Transactional(readOnly = true)
    public  List<AtorResponse> buscarPorNome (String primeiroNome, String ultimoNome){
        return atorRepository.findByPrimeiroNomeContainingIgnoreCaseAndUltimoNomeContainingIgnoreCase(primeiroNome, ultimoNome)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Transactional (readOnly = true)
    public AtorResponse buscarPorId(Long id){
        return atorRepository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new
                        RuntimeException("Ator não encontrado Id:"+id));
    }

    public AtorResponse atualizar(Long id, AtorUpdateRequest request){
        Ator ator = atorRepository.findById(id)
                .orElseThrow(() -> new
                        RuntimeException("Ator nao encontrado com Id: " + id));

        mapper.updateEntity(request, ator);
        Ator atualizado = atorRepository.save(ator);
        return  mapper.toResponse(atualizado);
    }

    @Transactional
    public void remover(Long id){
        Ator ator = atorRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Ator não encontrado Id:" + id));

        atorRepository.delete(ator);
    }

    @Transactional
    public AtorResponse atualizarParcialmente(Long id, AtorPatchRequest request){
        Ator ator = atorRepository.findById(id)
                .orElseThrow(() -> new
                        RuntimeException("Ator nao encontrado com Id: " + id));

        mapper.pacthEntity(request, ator);

        Ator atualizado = atorRepository.save(ator);
        return  mapper.toResponse(atualizado);
    }

}

