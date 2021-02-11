package com.meta.desafio.DTO.WBIndicators;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WBDataParent {
	private Long page;
	private Long pages;
	private Long per_page;
	private Long total;
	private Long sourceid;
	private String lastupdated;
	@JsonProperty(value="wb:data")
	private List<WBDataChild> wbData;
	@JsonProperty(value="xmlns:wb")
	private String xmlnsWb;
	
 	public WBDataParent() {
		super();
	}
 	
	public Long getPage() {
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPages() {
		return pages;
	}
	public void setPages(Long pages) {
		this.pages = pages;
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
	public Long getSourceid() {
		return sourceid;
	}
	public void setSourceid(Long sourceid) {
		this.sourceid = sourceid;
	}
	public String getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}

	public List<WBDataChild> getWbData() {
		return wbData;
	}

	public void setWbData(List<WBDataChild> wbData) {
		this.wbData = wbData;
	}

	public String getXmlnsWb() {
		return xmlnsWb;
	}

	public void setXmlnsWb(String xmlnsWb) {
		this.xmlnsWb = xmlnsWb;
	}
 	
}
