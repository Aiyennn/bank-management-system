package com.bankmanagement.system.models;

import com.bankmanagement.system.models.account.Account;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;

    public User(String id, String name, String phoneNumber, String emailAddress, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }
    public String getId() {
        return id;
    }
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
