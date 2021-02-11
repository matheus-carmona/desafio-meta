package com.meta.desafio.controller;

import static org.junit.Assert.assertNotNull;

import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meta.desafio.DTO.WBCountries.WBCountriesDTO;
import com.meta.desafio.DTO.WBIndicators.WBDataDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BancoControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	private ObjectMapper objectMapper;
	private final String URI = "http://localhost:8080/banco";

	@Before
	public void setup() {
		this.objectMapper = new ObjectMapper();
	};
	
    @Test
    public void testObterCodigosPaisesIsNotNull() throws Exception {
        URI uri = new URI(URI + "/paises");
        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(uri)).andExpect(MockMvcResultMatchers.status().is(200));
        MvcResult mvcResult = resultActions.andReturn();
        WBCountriesDTO response = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), WBCountriesDTO.class);       
        assertNotNull(response);
    }
    
    @Test
    public void testObterInformacaoPaisIsNotNull() throws Exception {
        URI uri = new URI(URI + "/AW");
        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(uri)).andExpect(MockMvcResultMatchers.status().is(200));
        MvcResult mvcResult = resultActions.andReturn();
        WBDataDTO response = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), WBDataDTO.class);       
        assertNotNull(response);
    }
	
}
