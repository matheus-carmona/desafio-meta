package com.meta.desafio.DTO.WBCountries;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WBCountriesDTO {
	@JsonProperty(value = "wb:countries")
	private WBCountries wbCountries;

	public WBCountriesDTO() {
		super();
	}

	public WBCountries getWbCountries() {
		return wbCountries;
	}

	public void setWbCountries(WBCountries wbCountries) {
		this.wbCountries = wbCountries;
	}
		
}
