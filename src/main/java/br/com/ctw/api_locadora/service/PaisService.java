package br.com.ctw.api_locadora.service;

import br.com.ctw.api_locadora.dto.PaisCreateRequest;
import br.com.ctw.api_locadora.dto.PaisPatchRequest;
import br.com.ctw.api_locadora.dto.PaisResponse;
import br.com.ctw.api_locadora.dto.PaisUpdateRequest;
import br.com.ctw.api_locadora.entity.Pais;
import br.com.ctw.api_locadora.mapper.PaisMapper;
import br.com.ctw.api_locadora.repository.PaisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaisService {

    private final PaisRepository paisRepository;
    private final PaisMapper mapper;

    @Transactional
    public PaisResponse cadastrar(PaisCreateRequest request){
        if(paisRepository.existsByPaisIgnoreCase(request.pais())){
            throw new IllegalArgumentException("Já existe um pais com esse nome");
        }


        Pais pais = mapper.toEntity(request);
        Pais salvo = paisRepository.save(pais);

        return mapper.toResponse(salvo);
    }

    @Transactional (readOnly = true)
    public List<PaisResponse> listar(){
        List<Pais> paises = paisRepository.findAll();
        return mapper.toResponseList(paises);
    }


    @Transactional(readOnly = true)
    public  List<PaisResponse> buscarPorNome (String pais){
        return paisRepository.findByPaisContainingIgnoreCase(pais)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Transactional (readOnly = true)
    public PaisResponse buscarPorId(Long id){
        return paisRepository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new
                        RuntimeException("Pais não encontrado Id:"+id));
    }

    public PaisResponse atualizar(Long id, PaisUpdateRequest request){
        Pais pais = paisRepository.findById(id)
                .orElseThrow(() -> new
                        RuntimeException("Pais nao encontrado com Id: " + id));

        mapper.updateEntity(request, pais);
        Pais atualizado = paisRepository.save(pais);
        return  mapper.toResponse(atualizado);
    }

    @Transactional
    public void remover(Long id){
        Pais pais = paisRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Pais não encontrado Id:" + id));

       paisRepository.delete(pais);
    }

    @Transactional
    public PaisResponse atualizarParcialmente(Long id, PaisPatchRequest request){
        Pais pais = paisRepository.findById(id)
                .orElseThrow(() -> new
                        RuntimeException("Pais nao encontrado com Id: " + id));

        mapper.pacthEntity(request, pais);

        Pais atualizado = paisRepository.save(pais);
        return  mapper.toResponse(atualizado);
    }

}
