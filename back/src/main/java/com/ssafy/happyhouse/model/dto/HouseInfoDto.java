package com.ssafy.happyhouse.model.dto;

public class HouseInfoDto {

	private String no;
	private String dong;
	private String aptName;
	private String code;
	private String buildYear;
	private String jibun;
	private String lat;
	private String lng;
	private String img;
	private String dealAmount;
	private String dealYear;
	private String area;
	
	public HouseInfoDto() {}

	public HouseInfoDto(String no, String dong, String aptName, String code, String buildYear, String jibun, String lat,
			String lng, String img, String dealAmount, String dealYear, String area) {
		super();
		this.no = no;
		this.dong = dong;
		this.aptName = aptName;
		this.code = code;
		this.buildYear = buildYear;
		this.jibun = jibun;
		this.lat = lat;
		this.lng = lng;
		this.img = img;
		this.dealAmount = dealAmount;
		this.dealYear = dealYear;
		this.area = area;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getAptName() {
		return aptName;
	}

	public void setAptName(String aptName) {
		this.aptName = aptName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}

	public String getJibun() {
		return jibun;
	}

	public void setJibun(String jibun) {
		this.jibun = jibun;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getDealYear() {
		return dealYear;
	}

	public void setDealYear(String dealYear) {
		this.dealYear = dealYear;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}	

}
