package com.hackathon.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FormObjectMapper {

	String filePath = "json.properties";
	File file = new File(filePath);

	public Data[] ReadJsonWithObjectMapper() throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
		Data[] data = objectMapper.readValue(new FileInputStream("form.json"), Data[].class);
		
		System.out.println("The array from ObjectMapper");
		// print the json stringify
		for (Data model : data) {

			System.out.println(model.getId() + "=" + model.getValue());
		}
		return data;
	}

	// public DomesticAirTravelFormTest formReadJsonWithObjectMapper() throws
	// IOException {
	// ObjectMapper objectMapper = new ObjectMapper();
	// DomesticAirTravelFormTest form = objectMapper.readValue(new
	// File("form.json"), DomesticAirTravelFormTest.class);
	//
	// List<String> lines = Arrays.asList(form.toString());
	//
	// try {
	// FileUtils.writeLines(file, lines, true);
	// } catch (IOException e) {
	// System.out.println("Problem occurs when writing file " + filePath);
	// e.printStackTrace();
	// }
	// ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter());
	// System.out.println(form.toString());
	// writer.writeValue(new File("json2.properties"), form);
	// return form;
	// }
	//
	// public ParentJsonNode[] readParentJsonWithObjectMapper() throws IOException {
	// ObjectMapper objectMapper = new ObjectMapper();
	// ParentJsonNode[] parent = objectMapper.readValue(new File("form.json"),
	// ParentJsonNode[].class);
	// System.out.println("Here is the file" + parent);
	// List<String> lines = Arrays.asList(parent.toString());
	//
	// try {
	// FileUtils.writeLines(file, lines, true);
	// } catch (IOException e) {
	// System.out.println("Problem occurs when writing file " + filePath);
	// e.printStackTrace();
	// }
	// ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter());
	// System.out.println(parent.toString());
	// writer.writeValue(new File("json2.properties"), parent);
	// return parent;
	// }

	// public void simple3ReadJsonWithObjectMapper() throws IOException {
	// ObjectMapper objectMapper = new ObjectMapper();
	//
	// List<ParentJsonNode> listCar = objectMapper.readValue(new
	// FileInputStream("form.json"),
	// new TypeReference<List<ParentJsonNode>>() {
	// });
	//
	// for (ParentJsonNode model : listCar) {
	// // System.out.println(model.getId() + "Value" + model.getValue() + "\n");
	// }
	// }
	//
	// public List<Location> getLocations() {
	// ObjectMapper objectMapper = new ObjectMapper();
	// List<Location> nulllist = null;
	// try {
	// TypeFactory typeFactory = objectMapper.getTypeFactory();
	// CollectionType collectionType =
	// typeFactory.constructCollectionType(List.class, Location.class);
	// CollectionType collectionType2 = objectMapper.readValue(new
	// File("form.json"), collectionType);
	// System.out.println("Here is the file" + collectionType2);
	// return objectMapper.readValue(new File("form.json"), collectionType);
	//
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// return nulllist;
	// }

	// Working well
	// public void simpleReadJsonWithObjectMapper() throws IOException {
	// ObjectMapper objectMapper = new ObjectMapper();
	//
	// HashMap<?, ?> empMap = objectMapper.readValue(new
	// FileInputStream("form.json"), HashMap.class);
	// for (HashMap.Entry<?, ?> entry : empMap.entrySet()) {
	// // logger.info("\n----------------------------\n" + entry.getKey() + "=" +
	// // entry.getValue() + "\n");
	// // System.out.println(entry.getKey() + "Value" + entry.getValue() + "\n");
	// Object id = entry.getKey();
	// if (empMap.containsKey("id")) {
	// Object value = empMap.get("id");
	// System.out.println("Key : " + id + " value :" + value);
	// }
	// }
	//
	// }
}