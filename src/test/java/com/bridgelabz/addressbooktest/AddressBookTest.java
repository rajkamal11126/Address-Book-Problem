package com.bridgelabz.addressbooktest;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.addressbook.AddressBookServiceImp;
import com.bridgelabz.addressbook.AddressBookServiceInf;
import com.bridgelabz.addressbook.Person;
import com.bridgelabz.addressbook.PersonServicesInf;
import com.bridgelabz.addressbook.PersonaServiceImp;

public class AddressBookTest {
	@Test
	public void givenPersonDetail_WhenProper_ShouldReturnTrue() throws IOException {
		Person person = new Person("Raj", "Kamal", "hinjewadi", "Pune", "Maharastra", 496683L, 9534543534L);
		PersonServicesInf personServicesInf = new PersonaServiceImp();
		boolean result = personServicesInf.addPerson(person);
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPersonDetail_WhenProper_ShouldReturnFalse() throws IOException {
		Person person = new Person("Kamal", "singh", "btm", "Dhanbad", "jharkhand", 496683L, 9874563210L);
		PersonServicesInf personServicesInf = new PersonaServiceImp();
		boolean result = personServicesInf.addPerson(person);
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPersonDetail_WhenProperEditing_ShouldReturnTrue() throws IOException {
		Person person = new Person("Rajkamal", "kamalraj", "vimanagar", "pune", "Maharastra", 496683L, 9874563210L);
		PersonServicesInf personServicesInf = new PersonaServiceImp();
		boolean result = personServicesInf.editInfo(person, person.getFirstName());
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPersonDetail_WhenProperDelete_ShouldReturnTrue() throws IOException {
		PersonServicesInf personServicesInf = new PersonaServiceImp();
		boolean result = personServicesInf.deletePerson("Rajkamal");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPersonDetail_WhenProperSortByName_ShouldReturnTrue() throws IOException {
		PersonServicesInf personServicesInf = new PersonaServiceImp();
		boolean result = personServicesInf.sortByName();
		Assert.assertEquals(true, result);

	}

	@Test
	public void givenPersonDetail_WhenProperSortByZip_ShouldReturnTrue() throws IOException {
		PersonServicesInf personServicesInf = new PersonaServiceImp();
		boolean result = personServicesInf.sortByZipCode();
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPersonDetail_WhenProperPrintEntries_ShouldReturnTrue() throws IOException {
		PersonServicesInf personServicesInf = new PersonaServiceImp();
		boolean result = personServicesInf.printEntries();
		Assert.assertEquals(true, result);
	}
	
	 @Test
	    public void givenAddressBook_WhenProperFileCreate_ShouldReturnTrue() throws IOException {
	        AddressBookServiceInf addressBookServiceInf=new AddressBookServiceImp();
	        boolean result = addressBookServiceInf.createNewAddressBook("newFile");
	        Assert.assertEquals(true, result);
	    }
}
