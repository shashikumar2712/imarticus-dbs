package com.example.demo.endpoint;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CustomHealth {

	Map<String,Object>  healthDetails;

	@JsonAnyGetter
	public Map<String, Object> getHealthDetails() {
		return healthDetails;
	}

	public void setHealthDetails(Map<String, Object> healthDetails) {
		this.healthDetails = healthDetails;
	}
	
	
}
