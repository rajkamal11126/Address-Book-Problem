package com.bridgelabz.addressbook;

import java.io.File;
import java.io.IOException;

public class AddressBookServiceImp implements AddressBookServiceInf {

    @Override
    public boolean createNewAddressBook(String files) {
        String newDirectoryPath="/Address-Book/src/main/java/com/bridgelabz/addressbook/AddressBook.json";
        File file = new File( newDirectoryPath + files + ".json");
        boolean existence = file.exists();
        if (existence) {
            System.out.println("File already Exist");
            return true;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

	@Override
	public void openExistingAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAddressBookAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitProgram() {
		// TODO Auto-generated method stub
		
	}
}