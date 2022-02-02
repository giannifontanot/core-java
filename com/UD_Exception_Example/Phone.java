package com.UD_Exception_Example;

public class Phone {
    private String phoneType;
    private String phoneNumber;

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone(String phoneType, String phoneNumber) {
        if(phoneNumber == null || phoneType == null){
            throw new IllegalArgumentException("Hey hey hey!!! Missing phone type / phone number");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "phone number:" + phoneNumber + ", phone type: " + phoneType;
    }


}

