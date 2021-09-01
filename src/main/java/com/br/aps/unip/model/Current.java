package com.br.aps.unip.model;

public class Current {
	
	private Double temp_c;
	
	private Condition condition;

	private AirQuality air_quality;

	public Double getTemp_c() {
		return temp_c;
	}

	public void setTemp_c(Double temp_c) {
		this.temp_c = temp_c;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public AirQuality getAir_quality() {
		return air_quality;
	}

	public void setAir_quality(AirQuality air_quality) {
		this.air_quality = air_quality;
	}
	
	
}
