package com.meta.desafio.service;

import org.json.XML;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meta.desafio.DTO.WBCountries.WBCountriesDTO;
import com.meta.desafio.DTO.WBIndicators.WBDataDTO;
import com.meta.desafio.exceptions.CustomException;

@Service
public class WBService {
	
    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;
    private final String URI = "http://api.worldbank.org/v2/country/";
    private final String URI_COMPLEMENTO = "/indicator/SI.POV.DDAY?format=xml";
    
	public WBDataDTO obterInformacaoPais(String codigo) throws CustomException{
		restTemplate = new RestTemplate();
    	objectMapper = new ObjectMapper();
        String retorno = restTemplate.getForObject(URI+codigo+URI_COMPLEMENTO,String.class);
        String retornoJSON = XML.toJSONObject(retorno).toString(4);
        WBDataDTO response = new WBDataDTO();
		try {
			response = objectMapper.readValue(retornoJSON, WBDataDTO.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
			throw new CustomException("Erro codigo");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new CustomException("Erro processar");
		}
        return response;
	}
	
	public WBCountriesDTO obterCodigosPaises() throws CustomException{
		restTemplate = new RestTemplate();
    	objectMapper = new ObjectMapper();
        String paisesXML = restTemplate.getForObject(URI,String.class);
        String paisesJSON = XML.toJSONObject(paisesXML).toString(4);
        WBCountriesDTO response = new WBCountriesDTO();
		try {
			response = objectMapper.readValue(paisesJSON, WBCountriesDTO.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
			throw new CustomException("Erro mapear");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new CustomException("Erro processar");
		}
        return response;
	}
	
}
