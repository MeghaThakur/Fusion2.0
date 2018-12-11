package com.hackathon.zbackup;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DomesticAirTravelFormTest {

	private String info;
	private String id;
	private String component;
	private String type;
	private String value;

	@JsonProperty("info")
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("component")
	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return ("info=" + info + " id=" + id + " component=" + component + " type=" + type + " value=" + value)
				.replaceAll("\\s+", System.getProperty("line.separator"));
	}

}
