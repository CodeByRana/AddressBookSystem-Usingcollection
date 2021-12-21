package com.blz.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Program");

        firstActions();
    }
    static String firstName;
    static String lastName;
    static String addressName;
    static String cityName;
    static String stateName;
    static String phoneNumber;
    static String emailId;
    static String search = null;
    static String fetchData = null;
    static public int choice = 0;
    static Scanner input = new Scanner (System.in);
    static ContactInformation contact;
    static ArrayList<String> information = new ArrayList<String>();

    //put here switch choice function like which activity you want to perform
    public static void firstActions() {
        System.out.println("Address Book Menu: What would you like to do? 1) Add data. 2) Display Record. 3) Edit Contact 4) Delete Contact 5) Close.");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                inputData();
            case 2:
                fetchAllData();
                break;
            case 3:
                updateData();
                break;
            case 4:
                deleteData();
                break;
            case 5:
                System.out.println("Application terminated.");
                System.exit(0);
            default:
                System.out.println("Please compile again.");
                break;
        }
    }
        //Add data by collection library
        public static void inputData()
        {
            information = new ArrayList<String>();
            contact = new ContactInformation(firstName, lastName,addressName,cityName,stateName,phoneNumber,emailId,information);
            System.out.println("What is your first name?");
            contact.setFirstName(input.next());
            information.add(contact.getFirstName());
            System.out.println("What is your last name?");
            contact.setLastName(input.next());
            information.add(contact.getLastName());
            System.out.println("What is your address?");
            contact.setAddressName(input.next());
            information.add(contact.getAddressName());
            System.out.println("What is your city?");
            contact.setCityName(input.next());
            information.add(contact.getCityName());
            System.out.println("What is your state?");
            contact.setStateName(input.next());
            information.add(contact.getStateName());
            System.out.println("What is your phone number?");
            contact.setPhoneNumber(input.next());
            information.add(contact.getPhoneNumber());
            System.out.println("What is your email id?");
            contact.setEmailId(input.next());
            information.add(contact.getEmailId());
            System.out.println("Saved.");
            System.out.println("What would you like to do next?");
            firstActions();
        }
        //Retrieve data using collection library
        public static void fetchAllData(){

        }
        //Update data using collection library
        public static void updateData(){

        }
        //Delete data using collection library
        public static void deleteData(){

        }

}

