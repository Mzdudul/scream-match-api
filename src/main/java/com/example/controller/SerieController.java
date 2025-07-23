package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.SerieDTO;

import com.example.screamatch_api.service.SerieService;

@RestController
public class SerieController {
    @Autowired
    private SerieService serieService;

    @GetMapping("/series")
    public List<SerieDTO> obterSeries(SerieService serieService) {
        return serieService.obterTodasAsSeries();
        
    }


    
    


}
