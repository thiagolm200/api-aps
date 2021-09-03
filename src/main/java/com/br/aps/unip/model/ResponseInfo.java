package com.br.aps.unip.model;

public class ResponseInfo {
	
	public ResponseInfo(RequestInfo request)
	{
		this.setName(request.getLocation().getName());
		this.setRegion(request.getLocation().getRegion());
		this.setTemp(Integer.valueOf(request.getCurrent().getTemp_c().toString()));
		
		String icon128 = "https:" + request.getCurrent().getCondition().getIcon().replace("64x64", "128x128");
		
		this.setIcon(icon128);
		this.setText(request.getCurrent().getCondition().getText());
		this.setCo(request.getCurrent().getAir_quality().getCo());
		this.setNo2(request.getCurrent().getAir_quality().getNo2());
		this.setO3(request.getCurrent().getAir_quality().getO3());
		this.setPm10(request.getCurrent().getAir_quality().getPm10());
		this.setPm2_5(request.getCurrent().getAir_quality().getPm2_5());
		this.setSo2(request.getCurrent().getAir_quality().getSo2());
		this.setUs_epa(request.getCurrent().getAir_quality().getUs());
		
	}

	private String name;
	
	private String region;
	
	private Integer temp;
	
	private String icon;
	
	private String text;
	
	private Double co;
	
	private Double no2;
	
	private Double o3;
	
	private Double so2;
	
	private Double  pm2_5;
	
	private Double pm10;
	
	private Double us_epa;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getTemp() {
		return temp;
	}

	public void setTemp(Integer temp) {
		this.temp = temp;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Double getCo() {
		return co;
	}

	public void setCo(Double co) {
		this.co = co;
	}

	public Double getNo2() {
		return no2;
	}

	public void setNo2(Double no2) {
		this.no2 = no2;
	}

	public Double getO3() {
		return o3;
	}

	public void setO3(Double o3) {
		this.o3 = o3;
	}

	public Double getSo2() {
		return so2;
	}

	public void setSo2(Double so2) {
		this.so2 = so2;
	}

	public Double getPm2_5() {
		return pm2_5;
	}

	public void setPm2_5(Double pm2_5) {
		this.pm2_5 = pm2_5;
	}

	public Double getPm10() {
		return pm10;
	}

	public void setPm10(Double pm10) {
		this.pm10 = pm10;
	}

	public Double getUs_epa() {
		return us_epa;
	}

	public void setUs_epa(Double us_epa) {
		this.us_epa = us_epa;
	}

}
