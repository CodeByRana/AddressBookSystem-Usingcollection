package com.blz.addressbook;
import java.util.ArrayList;

public class ContactInformation {
    //initialize variable for address book menu
    public String firstName;
    public String lastName;
    public String addressName;
    public String cityName;
    public String stateName;
    public String phoneNumber;
    public String emailId;
    ArrayList<String> information = new ArrayList<String>();

    //Constructor pass the value with parameter by collection
    public ContactInformation(String firstName, String lastName, String addressName, String cityName, String stateName,
                              String phoneNumber, String emailId, ArrayList<String> information) {
        super(); //parent class variable
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressName = addressName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.information = information;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressName() {
        return addressName;
    }
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
