package com.bridgelabz.addressbooktest;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.addressbook.Person;
import com.bridgelabz.addressbook.PersonServicesInf;
import com.bridgelabz.addressbook.PersonaServiceImp;

public class AddressBookTest {
	@Test
	public void givenPersonDetail_WhenProper_ShouldReturnTrue() throws IOException {
		Person person = new Person("Raj", "Kamal", "hinjewadi", "Pune", "Maharastra", 496683L, 9874563210L);
		PersonServicesInf personServicesInf = new PersonaServiceImp();
		personServicesInf.addPerson(person);
		Assert.assertEquals(person.getFirstName(), personServicesInf.addPerson(person).getFirstName());
	}

	@Test
	public void givenPersonDetail_WhenProper_ShouldReturnFalse() throws IOException {
		Person person = new Person("raj", "kamal", "pune", "vimannagar", "Maharastra", 496683L, 9874563210L);
		PersonServicesInf personServicesInf = new PersonaServiceImp();
		personServicesInf.addPerson(person);
		Assert.assertNotEquals(person.getCity(), personServicesInf.addPerson(person).getFirstName());
	}
}
