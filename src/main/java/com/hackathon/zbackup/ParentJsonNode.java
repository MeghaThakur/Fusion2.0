package com.hackathon.zbackup;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hackathon.bean.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParentJsonNode {

	private Data data;

	@JsonProperty("data")
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
