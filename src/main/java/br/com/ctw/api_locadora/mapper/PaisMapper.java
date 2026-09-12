package br.com.ctw.api_locadora.mapper;

import br.com.ctw.api_locadora.dto.PaisCreateRequest;
import br.com.ctw.api_locadora.dto.PaisPatchRequest;
import br.com.ctw.api_locadora.dto.PaisResponse;
import br.com.ctw.api_locadora.dto.PaisUpdateRequest;

import br.com.ctw.api_locadora.entity.Pais;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaisMapper {

    public Pais toEntity(PaisCreateRequest request){
        return Pais.builder()
                .pais(request.pais())
                .ultimaAtualizacao(request.ultimaAtualizacao())
                .build();
    }

    public PaisResponse toResponse (Pais pais){
        return new PaisResponse(
                pais.getPaisId(),
                pais.getPais(),
                pais.getUltimaAtualizacao()
        );
    }

    public List<PaisResponse> toResponseList(List<Pais> paises){
        return paises.stream()
                .map(this::toResponse)
                .toList();
    }

    public void updateEntity(PaisUpdateRequest request, Pais pais){
        pais.setPais(request.pais());
        pais.setUltimaAtualizacao(request.ultimaAtualizacao());
    }

    public void pacthEntity(PaisPatchRequest request, Pais pais){
        if(request.pais() != null){
            pais.setPais(request.pais());
        }
        if (request.ultimaAtualizacao() != null){
            pais.setUltimaAtualizacao(request.ultimaAtualizacao());
        }
    }
}
