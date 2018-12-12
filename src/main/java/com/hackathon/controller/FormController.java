package com.hackathon.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.hackathon.PopulateFusionPage;
import com.hackathon.bean.Data;

@RestController
@RequestMapping("scrapper")
public class FormController {

	@PostMapping("/postJson")
	public void formJson(@RequestBody String formJson)
			throws JsonParseException, JsonMappingException, IOException, InterruptedException {

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
		List<Data> data = objectMapper.readValue(formJson, new TypeReference<List<Data>>() {
		});

		for (Data model : data) {
			System.out.println("Inside the PostMapping");
			System.out.println(model.getId() + "=" + model.getValue());
		}

		List<String> lines = Arrays.asList(formJson);
		ObjectWriter jsonWriter = new ObjectMapper().configure(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT, true)
				.writer();
		System.out.println(formJson);
		jsonWriter.writeValue(new File("form.json"), data);

		Thread.sleep(5000);

		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		Result result = junit.run(PopulateFusionPage.class);
	}

}
