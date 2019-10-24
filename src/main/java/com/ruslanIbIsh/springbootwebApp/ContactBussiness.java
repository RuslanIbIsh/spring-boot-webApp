package com.ruslanIbIsh.springbootwebApp;

import java.util.ArrayList;
import java.util.List;

public class ContactBussiness {

    public List<Contact> getContactList() {



        List<Contact> listContast = new ArrayList<>();

        listContast.add(new Contact("Garry Bell", "garry@gmail.com", "USA"));
        listContast.add(new Contact("Shon Pen", "shon@gmail.com", "England"));
        listContast.add(new Contact("Chat Lee", "chat@gmail.com", "Canada"));

        return listContast;
    }
}
