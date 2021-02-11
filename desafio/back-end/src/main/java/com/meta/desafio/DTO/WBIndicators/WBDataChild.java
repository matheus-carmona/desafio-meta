package com.meta.desafio.DTO.WBIndicators;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WBDataChild {
	@JsonProperty(value="wb:indicator")
	private WBIndicator wbIndicator;
	@JsonProperty(value="wb:decimal")
	private Double wbDecimal;
	@JsonProperty(value="wb:country")
	private WBCountry wbCountry;
	@JsonProperty(value="wb:value")
	private String value;
	@JsonProperty(value="wb:obs_status")
	private String wbObsStatus;
	@JsonProperty(value="wb:unit")
	private String wbUnit;
	@JsonProperty(value="wb:date")
	private Long wbDate;
	@JsonProperty(value="wb:countryiso3code")
	private String wbCountryIso3Code;
	
	public WBDataChild() {
		super();
	}


}
