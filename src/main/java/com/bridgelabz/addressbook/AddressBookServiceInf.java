package com.bridgelabz.addressbook;

public interface AddressBookServiceInf {
	public boolean createNewAddressBook(String files);
    public void openExistingAddressBook();
    public void saveAddressBook();
    public void saveAddressBookAs();
    public void quitProgram();

}
