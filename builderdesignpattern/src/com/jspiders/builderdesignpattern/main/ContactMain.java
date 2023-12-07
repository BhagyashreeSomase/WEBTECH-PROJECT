package com.jspiders.builderdesignpattern.main;
import com.jspiders.builderdesignpattern.builder.ContactBuilder;
import com.jspiders.builderdesignpattern.object.Contact;
public class ContactMain {
public static void main(String[]args) {
Contact contact=new ContactBuilder().mobile_no(7038112719l).last_name("Shinde").first_name("Harish").getContact();
System.out.println(contact);
}
}	