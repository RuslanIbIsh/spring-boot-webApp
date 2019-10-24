package com.ruslanIbIsh.springbootwebApp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

@RequestMapping("/test")
    public String test() {
    System.out.println("AppController ->welcome");
        return "test";
    }


@RequestMapping("/list_contact")
    public String listContact(Model model) {

    ContactBussiness bussiness = new ContactBussiness();
    List<Contact> contactList = bussiness.getContactList();


    model.addAttribute("contacts", contactList);
    return "contact";

    }
}
