package com.planbtech.cosmos.dto;

import com.planbtech.cosmos.model.entites.MaritalStatus;

public class MaritalStatusDTO {
    private String maritalStatus;
	private Long id;
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public MaritalStatusDTO(MaritalStatus entidy) {
		this.maritalStatus = entidy.getMaritalStatus();
		this.id = entidy.getId();
	}
}
