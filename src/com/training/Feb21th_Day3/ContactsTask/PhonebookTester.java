package com.training.Feb21th_Day3.ContactsTask;

public class PhonebookTester {
    public static void main(String... args){
        PhoneBook phonebook = new PhoneBook();
        Contact contact1 = new Contact("Syed","S", 987);
        phonebook.addContact(contact1);
        Contact contact2 = new Contact("Khaja","K", 986);
        phonebook.addContact(contact2);
        Contact contact3 = new Contact("Moinuddin","M", 985);
        phonebook.addContact(contact3);
        Contact contact4 = new Contact("Syed","S", 987);
        phonebook.addContact(contact4);

        //use Treeset to fetch duplicates with phonenum comparison
        phonebook.removeContact(contact1);
        System.out.println(phonebook.getAllContacts());
        //System.out.println(phonebook.getContactbyNum(987653));
    }
}
