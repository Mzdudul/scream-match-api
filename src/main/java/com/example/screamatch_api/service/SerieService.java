package com.example.screamatch_api.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.EpisodioDTO;
import com.example.dto.SerieDTO;
import com.example.screamatch_api.model.Categoria;

import com.example.screamatch_api.model.Serie;
import com.example.screamatch_api.repository.SerieRepository;

@Service
public class SerieService {
    
    @Autowired
    private SerieRepository repositorio;

    public List<SerieDTO> obterTodasAsSeries(){
        return converteDados(repositorio.findAll());                
    }

    public List<SerieDTO> obterTop5Series() {
         return converteDados(repositorio.findTop5ByOrderByAvaliacaoDesc());
    }

    public List<SerieDTO> obterTop5Lancamentos() {
        return converteDados(repositorio.lancamentosMaisRecentes());
    }

    public SerieDTO obterPorId(Long id) {
       Optional <Serie> serie = repositorio.findById(id);

       if(serie.isPresent()){
        Serie s = serie.get();
        return new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(),
                        s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getSinopse());
       }
       return null;
        
                
    }
    public List<EpisodioDTO> obterTodasTemporadas(Long id) {
        Optional<Serie> serie = repositorio.findById(id);

        if(serie.isPresent()){
        Serie s = serie.get();
        return s.getEpisodios().stream()
                .map(ep -> new EpisodioDTO(ep.getTemporada(), ep.getNumeroEpisodio(), ep.getTitulo()))
                .collect(Collectors.toList());
       }
       return null;
    }

    private List<SerieDTO> converteDados(List<Serie> series) {
        return series.stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(),
                        s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getSinopse()))
                .collect(Collectors.toList());
    }

    public List<EpisodioDTO> obterTemporadasPorNumero(Long id, Long numero) {
       return repositorio.obterEpisodiosPorTemporada(id, numero)
       .stream()
       .map(ep -> new EpisodioDTO(ep.getTemporada(), ep.getNumeroEpisodio(), ep.getTitulo()))
       .collect(Collectors.toList());
    }

    public List<SerieDTO> obterSeriesPorCategoria(String categoria) {
        Categoria cat = Categoria.fromPortugues(categoria);
        return converteDados(repositorio.findByGenero(cat));
    }

    
}
