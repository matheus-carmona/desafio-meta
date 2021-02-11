package com.meta.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meta.desafio.DTO.WBCountries.WBCountriesDTO;
import com.meta.desafio.DTO.WBIndicators.WBDataDTO;
import com.meta.desafio.exceptions.CustomException;
import com.meta.desafio.service.WBService;


@RestController
@RequestMapping("/banco")
public class BancoController {
    @Autowired
    WBService wbService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/{codigo}",method = RequestMethod.GET)
    public ResponseEntity<WBDataDTO> obterInformacaoPais(@PathVariable String codigo) throws CustomException{
        return ResponseEntity.ok(wbService.obterInformacaoPais(codigo));
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/paises")
    public ResponseEntity<WBCountriesDTO> obterCodigosPaises() throws CustomException{
    	return ResponseEntity.ok(wbService.obterCodigosPaises());
    }
}
