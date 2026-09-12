package br.com.ctw.api_locadora.mapper;

import br.com.ctw.api_locadora.dto.AtorCreateRequest;
import br.com.ctw.api_locadora.dto.AtorPatchRequest;
import br.com.ctw.api_locadora.dto.AtorResponse;
import br.com.ctw.api_locadora.dto.AtorUpdateRequest;
import br.com.ctw.api_locadora.entity.Ator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtorMapper{

    public Ator toEntity(AtorCreateRequest request){
        return Ator.builder()
                .primeiroNome(request.primeiroNome())
                .ultimoNome(request.ultimoNome())
                .ultimaAtualizacao(request.ultimaAtualizacao())
                .build();
    }

    public AtorResponse toResponse (Ator ator){
        return new AtorResponse(
                ator.getAtorId(),
                ator.getPrimeiroNome(),
                ator.getUltimoNome(),
                ator.getUltimaAtualizacao()
        );
    }

    public List<AtorResponse> toResponseList(List<Ator> atores){
        return atores.stream()
                .map(this::toResponse)
                .toList();
    }

    public void updateEntity(AtorUpdateRequest request, Ator ator){
        ator.setPrimeiroNome(request.primeiroNome());
        ator.setUltimoNome(request.ultimoNome());
        ator.setUltimaAtualizacao(request.ultimaAtualizacao());
    }

    public void pacthEntity(AtorPatchRequest request,Ator ator){
        if(request.primeiroNome() != null){
            ator.setPrimeiroNome(request.primeiroNome());
        }
        if(request.ultimoNome() != null){
            ator.setUltimoNome(request.ultimoNome());
        }
        if (request.ultimaAtualizacao() != null){
            ator.setUltimaAtualizacao(request.ultimaAtualizacao());
        }
    }



}
