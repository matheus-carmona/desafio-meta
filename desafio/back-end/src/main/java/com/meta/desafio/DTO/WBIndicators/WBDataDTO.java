package com.meta.desafio.DTO.WBIndicators;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WBDataDTO {
	@JsonProperty(value="wb:data")
	private WBDataParent wbData;

	public WBDataDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WBDataParent getWbData() {
		return wbData;
	}

	public void setWbData(WBDataParent wbData) {
		this.wbData = wbData;
	}
	
}
