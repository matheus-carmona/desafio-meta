package com.meta.desafio.DTO.WBCountries;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WBCountry {
	
	@JsonProperty(value="wb:latitude")
	private Double wbLatitude;
	@JsonProperty(value="wb:longitude")
	private Double wbLongitude;
	@JsonProperty(value="wb:region")
	private WBRegion wbRegion;
	@JsonProperty(value="wb:lendingType")
	private WBLendingType wbLendingType;
	@JsonProperty(value="wb:adminregion")
	private WBAdminRegion wbAdminRegion;
	@JsonProperty(value="wb:capitalCity")
	private String wbCapitalCity;
	@JsonProperty(value="wb:iso2Code")
	private String wbIso2Code;
	@JsonProperty(value="wb:incomeLevel")
	private WBIncomeLevel wbIncomeLevel;
	private String id;
	@JsonProperty(value="wb:name")
	private String wbName;
	
	public WBCountry() {
		super();
	}

	public Double getWbLatitude() {
		return wbLatitude;
	}

	public void setWbLatitude(Double wbLatitude) {
		this.wbLatitude = wbLatitude;
	}

	public Double getWbLongitude() {
		return wbLongitude;
	}

	public void setWbLongitude(Double wbLongitude) {
		this.wbLongitude = wbLongitude;
	}

	public WBRegion getWbRegion() {
		return wbRegion;
	}

	public void setWbRegion(WBRegion wbRegion) {
		this.wbRegion = wbRegion;
	}

	public WBLendingType getWbLendingType() {
		return wbLendingType;
	}

	public void setWbLendingType(WBLendingType wbLendingType) {
		this.wbLendingType = wbLendingType;
	}

	public WBAdminRegion getWbAdminRegion() {
		return wbAdminRegion;
	}

	public void setWbAdminRegion(WBAdminRegion wbAdminRegion) {
		this.wbAdminRegion = wbAdminRegion;
	}

	public String getWbCapitalCity() {
		return wbCapitalCity;
	}

	public void setWbCapitalCity(String wbCapitalCity) {
		this.wbCapitalCity = wbCapitalCity;
	}

	public String getWbIso2Code() {
		return wbIso2Code;
	}

	public void setWbIso2Code(String wbIso2Code) {
		this.wbIso2Code = wbIso2Code;
	}

	public WBIncomeLevel getWbIncomeLevel() {
		return wbIncomeLevel;
	}

	public void setWbIncomeLevel(WBIncomeLevel wbIncomeLevel) {
		this.wbIncomeLevel = wbIncomeLevel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWbName() {
		return wbName;
	}

	public void setWbName(String wbName) {
		this.wbName = wbName;
	}	
		
}
