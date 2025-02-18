package com.progettoSettimanale.Gestione.viaggi.dipendenti;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@RequiredArgsConstructor
@Validated
public class DipendenteService {
    private final DipendenteRepository dipendenteRepository;

    public DipendenteResponse dipendenteResponseFromEntity(Dipendente dipendente) {
        DipendenteResponse dipendenteResponse = new DipendenteResponse();
        BeanUtils.copyProperties(dipendente, dipendenteResponse);
        return dipendenteResponse;
    }
    public List<DipendenteResponse> dipendenteResponseFromEntities(List<Dipendente> dipendente) {
        return dipendente.stream().map(this::dipendenteResponseFromEntity).toList();
    }
    public List<DipendenteResponse> findAll() {
        return dipendenteResponseFromEntities(dipendenteRepository.findAll());
    }
    public Dipendente dipendenteFromRequest(DipendenteRequest dipendenteRequest) {
        Dipendente dipendente = new Dipendente();
        BeanUtils.copyProperties(dipendenteRequest, dipendente);
        return dipendente;
    }
    public DipendenteResponse modify(Long id, DipendenteRequest dipendenteRequest) {
       if (dipendenteRepository.existsByUsername(dipendenteRequest.getUsername())) {
         throw new IllegalArgumentException("Username already exists");
       }else {
           
           BeanUtils.copyProperties(dipendenteRequest, dipendente);
           dipendenteRepository.save(dipendente);
           return dipendenteResponseFromEntity(dipendente);
       }
    }
    public DipendenteResponse sa(Long id, DipendenteRequest dipendenteRequest) {
        if (dipendenteRepository.existsByUsername(dipendenteRequest.getUsername())) {
            throw new IllegalArgumentException("Username already exists");
        }else {
            Dipendente dipendente = findById(id);
            BeanUtils.copyProperties(dipendenteRequest, dipendente);
            dipendenteRepository.save(dipendente);
            return dipendenteResponseFromEntity(dipendente);
        }
    }
    public delete(Long id) {
        dipendenteRepository.deleteById(id);
    }
}
