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
    ArrayList<Person> personInformation = new ArrayList<>();
    public Person addPerson(Person personData) throws IOException {
        try {
        	personInformation = fileRead();
        	personInformation.add(personData);
            writeIntoJson(personInformation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personData;
    }
    public boolean editInfo(Person person, String firstName) throws IOException {
        ArrayList<Person> personInformation = fileRead();

        for (Person personInfo : personInformation) {
            if (personInfo.getFirstName().equals(firstName)) {

                personInfo.setLastName(person.getLastName());
                personInfo.setAddress(person.getAddress());
                personInfo.setCity(person.getCity());
                personInfo.setState(person.getState());
                personInfo.setZip(person.getZip());
                personInfo.setPhoneNumber(person.getPhoneNumber());

            }
        }
        writeIntoJson(personInformation);
        return true;
    }
	public void deletePerson(Person person) {

    }

    public void sortByLastName(Person person) {

    }

    public void sortByZipCode(Person person) {

    }

    public void writeIntoJson(ArrayList<Person> list) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(list);
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
	@Override
	public void deletePerson(String firstName) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
