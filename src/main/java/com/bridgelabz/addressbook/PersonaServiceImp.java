package com.bridgelabz.addressbook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class PersonaServiceImp implements PersonServicesInf {
	public static String filepath="/Address-Book/src/main/java/com/bridgelabz/addressbook/AddressBook.json";
    ArrayList<Person> addPerson = new ArrayList<>();
    public Person addPerson(Person personData) throws IOException {
        try {
            addPerson = fileRead();
            addPerson.add(personData);
            writeJson();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personData;
    }
    public void editInfo(Person person) {

    }

    public void deletePerson(Person person) {

    }

    public void sortByLastName(Person person) {

    }

    public void sortByZipCode(Person person) {

    }

    public void writeJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(addPerson);
        try (FileWriter file = new FileWriter(filepath)) {
            file.write(json);
            System.out.println("written to json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Add person detail:" + json);
    }

    public void printEntries() {

    }

    public ArrayList<Person> fileRead() throws IOException {
       ObjectMapper objectMapper=new ObjectMapper();
       ArrayList<Person> personList = objectMapper.readValue(new File(filepath), new TypeReference<ArrayList<Person>>() {});
       return personList;
    }
}
