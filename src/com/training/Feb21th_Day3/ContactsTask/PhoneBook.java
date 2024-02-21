package com.training.Feb21th_Day3.ContactsTask;

import java.util.*;

public class PhoneBook{
    List<Contact> allContacts = new ArrayList<Contact>();
    private Contact contact;


    public void addContact(Contact contact) {
        if (getContactbyNum(contact.getPhoneNum()) == null){
            allContacts.add(contact);
            System.out.println("Contact Saved!");
        }else{
            System.out.println("You have this contact already!!");
        }
    }
    public List<Contact> getAllContacts() {
        return allContacts;
    }
    public void removeContact(Contact contact) {
        allContacts.remove(contact);
    }
    public Contact getContactbyNum(int phoneNum) {
        for(Contact con: allContacts){
            if (con.getPhoneNum() == phoneNum){
                contact = con;
                break;
            }
        }
        return contact;
    }



}
