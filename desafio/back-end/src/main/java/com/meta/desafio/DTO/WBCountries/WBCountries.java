package com.meta.desafio.DTO.WBCountries;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WBCountries {
	private Long per_page;
	private Long total;
	private Long pages;
	@JsonProperty(value = "wb:country")
	private List<WBCountry> wbCountry;
	private Long page;
	@JsonProperty(value="xmlns:wb")
	private String xmlnsWb;
	
	public WBCountries() {
		super();
	}
	
	public Long getPer_page() {
		return per_page;
	}
	public void setPer_page(Long per_page) {
		this.per_page = per_page;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getPages() {
		return pages;
	}
	public void setPages(Long pages) {
		this.pages = pages;
	}
	public List<WBCountry> getWbCountry() {
		return wbCountry;
	}
	public void setWbCountry(List<WBCountry> WbCountry) {
		this.wbCountry = WbCountry;
	}
	public Long getPage() {
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public String getXmlnsWb() {
		return xmlnsWb;
	}
	public void setXmlnsWb(String xmlnsWb) {
		this.xmlnsWb = xmlnsWb;
	}
	
}
