package com.example.screamatch_api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.dto.SerieDTO;
import com.example.screamatch_api.repository.SerieRepository;

@Service
public class SerieService {
    
    private SerieRepository serieRepository;

    public List<SerieDTO> obterTodasAsSeries(){
        return serieRepository.findAll()
                .stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(),
                        s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getSinopse()))
                .collect(Collectors.toList());
    }
}
